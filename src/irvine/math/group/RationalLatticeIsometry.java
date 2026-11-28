package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Bounded exact isometry test for positive definite integral lattices.
 * @author Gregory Morse
 */
final class RationalLatticeIsometry {

  private static final Q HALF = new Q(1, 2);
  private static final Q DELTA = new Q(3, 4);

  private static final class Limit extends RuntimeException { }

  private final int mVectorLimit;
  private long mBudget;

  private RationalLatticeIsometry(final int vectorLimit, final long budget) {
    mVectorLimit = vectorLimit;
    mBudget = budget;
  }

  private void charge(final int count) {
    mBudget -= count;
    if (mBudget < 0) {
      throw new Limit();
    }
  }

  private static Z floor(final Z numerator, final Z denominator) {
    return numerator.subtract(numerator.mod(denominator)).divide(denominator);
  }

  private static Z floor(final Q q) {
    return floor(q.num(), q.den());
  }

  private static final class Orthogonal {
    private final Q[] mNorm;
    private final Q[][] mMu;

    private Orthogonal(final Z[][] gram) {
      final int n = gram.length;
      mNorm = new Q[n];
      mMu = new Q[n][];
      for (int i = 0; i < n; ++i) {
        mMu[i] = new Q[i];
        for (int j = 0; j <= i; ++j) {
          Q value = new Q(gram[i][j]);
          for (int k = 0; k < j; ++k) {
            if (mMu[i][k].signum() != 0 && mMu[j][k].signum() != 0) {
              value = value.subtract(mMu[i][k].multiply(mMu[j][k]).multiply(mNorm[k]));
            }
          }
          if (i == j) {
            if (value.signum() <= 0) {
              throw new IllegalArgumentException("Gram matrix is not positive definite");
            }
            mNorm[i] = value;
          } else {
            mMu[i][j] = value.divide(mNorm[j]);
          }
        }
      }
    }
  }

  private Z[][] reduce(final Z[][] input) {
    final int n = input.length;
    final Z[][] a = Arrays.stream(input).map(Z[]::clone).toArray(Z[][]::new);
    Orthogonal reduced = new Orthogonal(a);
    int k = 1;
    while (k < n) {
      charge(n * n);
      for (int j = k - 1; j >= 0; --j) {
        final Z multiple = floor(reduced.mMu[k][j].add(HALF));
        if (!multiple.isZero()) {
          final Z diag = a[k][k].subtract(multiple.multiply(a[k][j]).shiftLeft(1)).add(multiple.square().multiply(a[j][j]));
          for (int i = 0; i < n; ++i) {
            if (i != k) {
              a[k][i] = a[k][i].subtract(multiple.multiply(a[j][i]));
              a[i][k] = a[k][i];
            }
          }
          a[k][k] = diag;
          charge(n * n * n);
          reduced = new Orthogonal(a);
        }
      }
      final Q mu = reduced.mMu[k][k - 1];
      if (reduced.mNorm[k].compareTo(DELTA.subtract(mu.multiply(mu)).multiply(reduced.mNorm[k - 1])) < 0) {
        final Z[] row = a[k];
        a[k] = a[k - 1];
        a[k - 1] = row;
        for (int i = 0; i < n; ++i) {
          final Z x = a[i][k];
          a[i][k] = a[i][k - 1];
          a[i][k - 1] = x;
        }
        charge(n * n * n);
        reduced = new Orthogonal(a);
        k = Math.max(k - 1, 1);
      } else {
        ++k;
      }
    }
    return a;
  }

  private Map<Z, List<int[]>> shells(final Z[][] gram, final Z bound, final boolean retain) {
    final Map<Z, List<int[]>> result = new HashMap<>();
    enumerate(new Orthogonal(gram), new Q(bound), bound, new int[gram.length], gram.length - 1, result, retain, new int[1]);
    return result;
  }

  private void enumerate(final Orthogonal o, final Q remain, final Z bound, final int[] x, final int k,
                         final Map<Z, List<int[]>> result, final boolean retain, final int[] count) {
    charge(x.length);
    if (k < 0) {
      final Q norm = new Q(bound).subtract(remain);
      if (!norm.isInteger()) {
        throw new IllegalStateException("Integral lattice yielded a fractional norm");
      }
      if (norm.signum() != 0) {
        if (++count[0] > mVectorLimit) {
          throw new Limit();
        }
        result.computeIfAbsent(norm.toZ(), v -> new ArrayList<>()).add(retain ? x.clone() : null);
      }
      return;
    }
    Q shift = Q.ZERO;
    for (int j = k + 1; j < x.length; ++j) {
      if (x[j] != 0 && o.mMu[j][k].signum() != 0) {
        shift = shift.add(o.mMu[j][k].multiply(new Q(x[j])));
      }
    }
    final Z denominator = shift.den();
    final Q squared = remain.divide(o.mNorm[k]).multiply(new Q(denominator.square()));
    // (denominator * x_k + numerator)^2 <= squared.  An integer square
    // can be bounded by the floor without any floating-point rounding.
    final Z radius = floor(squared).sqrt();
    final int lo = floor(radius.add(shift.num()), denominator).negate().intValueExact();
    final int hi = floor(radius.subtract(shift.num()), denominator).intValueExact();
    for (long v = lo; v <= hi; ++v) {
      x[k] = (int) v;
      final Q t = shift.add(new Q(v));
      enumerate(o, remain.subtract(t.multiply(t).multiply(o.mNorm[k])), bound, x, k - 1, result, retain, count);
    }
  }

  private static Z[] multiply(final int[] vector, final Z[][] gram) {
    final int n = vector.length;
    final Z[] result = new Z[n];
    Arrays.fill(result, Z.ZERO);
    for (int i = 0; i < n; ++i) {
      if (vector[i] != 0) {
        for (int j = 0; j < n; ++j) {
          if (!gram[i][j].isZero()) {
            result[j] = result[j].add(gram[i][j].multiply(vector[i]));
          }
        }
      }
    }
    return result;
  }

  private static Z dot(final int[] vector, final Z[] covector) {
    Z sum = Z.ZERO;
    for (int i = 0; i < vector.length; ++i) {
      if (vector[i] != 0 && !covector[i].isZero()) {
        sum = sum.add(covector[i].multiply(vector[i]));
      }
    }
    return sum;
  }

  private boolean embed(final Z[][] a, final Z[][] b, final int[] order, final List<List<int[]>> vectors,
                        final Z[][] images, final int depth) {
    if (depth == order.length) {
      return true;
    }
    final int row = order[depth];
    for (final int[] candidate : vectors.get(row)) {
      charge(candidate.length * (depth + 1));
      boolean fits = true;
      for (int j = 0; j < depth; ++j) {
        if (!dot(candidate, images[j]).equals(b[row][order[j]])) {
          fits = false;
          break;
        }
      }
      if (fits) {
        images[depth] = multiply(candidate, a);
        if (embed(a, b, order, vectors, images, depth + 1)) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean compare(final Z[][] a, final Z[][] b) {
    final Z[][] aa = reduce(a);
    final Z[][] bb = reduce(b);
    if (Arrays.deepEquals(aa, bb)) {
      return true;
    }
    final int n = aa.length;
    Z minimum = bb[0][0];
    Z bound = minimum;
    for (int i = 1; i < n; ++i) {
      minimum = minimum.min(bb[i][i]);
      bound = bound.max(bb[i][i]);
    }
    final Map<Z, List<int[]>> smallA = shells(aa, minimum, false);
    final Map<Z, List<int[]>> smallB = shells(bb, minimum, false);
    if (!smallA.equals(smallB)) {
      return false;
    }
    final Map<Z, List<int[]>> shells = shells(aa, bound, true);
    final List<List<int[]>> required = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
      final List<int[]> v = shells.get(bb[i][i]);
      if (v == null) {
        return false;
      }
      required.add(v);
    }
    final int[] order = IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> required.get(i).size())).mapToInt(Integer::intValue).toArray();
    // The caller checks equal determinant. An integer basis attaining
    // the full Gram matrix then has determinant +/-1, not just full rank.
    return embed(aa, bb, order, required, new Z[n][], 0);
  }

  static Optional<Boolean> matches(final Z[][] a, final Z[][] b, final int vectors, final long budget) {
    if (!PrimeLatticeProfiles.fingerprint(a).equals(PrimeLatticeProfiles.fingerprint(b))) {
      return Optional.of(false);
    }
    try {
      return Optional.of(new RationalLatticeIsometry(vectors, budget).compare(a, b));
    } catch (final Limit | ArithmeticException e) {
      return Optional.empty();
    }
  }

  private boolean differentNeighborhoods(final Z[][] a, final Z[][] b) {
    final Z[][] aa = reduce(a);
    final Z[][] bb = reduce(b);
    Z bound = aa[0][0].min(bb[0][0]);
    for (int i = 1; i < aa.length; ++i) {
      bound = bound.min(aa[i][i]).min(bb[i][i]);
    }
    final Map<Z, List<int[]>> aShells = shells(aa, bound, true);
    final Map<Z, List<int[]>> bShells = shells(bb, bound, true);
    final Z minA = aShells.keySet().stream().min(Z::compareTo).orElse(null);
    final Z minB = bShells.keySet().stream().min(Z::compareTo).orElse(null);
    if (minA == null || !minA.equals(minB)) {
      return true;
    }
    final List<int[]> av = aShells.get(minA);
    final List<int[]> bv = bShells.get(minB);
    if (av.size() != bv.size()) {
      return true;
    }
    final Map<Z, Integer> expected = new HashMap<>();
    final Z[] anchor = multiply(av.get(0), aa);
    for (final int[] x : av) {
      charge(x.length);
      expected.merge(dot(x, anchor), 1, Integer::sum);
    }
    for (final int[] y : bv) {
      final Z[] image = multiply(y, bb);
      final Map<Z, Integer> found = new HashMap<>();
      boolean matches = true;
      for (final int[] x : bv) {
        charge(x.length);
        final Z value = dot(x, image);
        if (found.merge(value, 1, Integer::sum) > expected.getOrDefault(value, 0)) {
          matches = false;
          break;
        }
      }
      if (matches) {
        return false;
      }
    }
    return true;
  }

  static boolean excludesMinimumNeighborhood(final Z[][] a, final Z[][] b, final int vectors, final long budget) {
    try {
      return new RationalLatticeIsometry(vectors, budget).differentNeighborhoods(a, b);
    } catch (final Limit | ArithmeticException e) {
      return false;
    }
  }

  static boolean isRootlessEvenUnimodular(final Z[][] gram) {
    if (!PrimeLatticeProfiles.fingerprint(gram).isEvenUnimodular()) {
      return false;
    }
    try {
      final RationalLatticeIsometry search = new RationalLatticeIsometry(1, 3000000);
      return search.shells(search.reduce(gram), Z.TWO, false).isEmpty();
    } catch (final Limit | ArithmeticException e) {
      return false;
    }
  }
}
