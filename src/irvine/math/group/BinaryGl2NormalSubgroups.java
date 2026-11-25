package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;

/**
 * Normal-subgroup counts for GL(2,Z/2^e Z).
 * @author Gregory Morse
 */
final class BinaryGl2NormalSubgroups {

  private BinaryGl2NormalSubgroups() { }

  private static final class Subgroup {
    private final BitSet mSet;
    private final int[] mElements;
    private final int[] mGenerators;
    private final int mLevel;

    private Subgroup(final BitSet set, final int[] elements, final int[] generators, final int level) {
      mSet = set;
      mElements = elements;
      mGenerators = generators;
      mLevel = level;
    }
  }

  // Lacroix, Theorem 3.4.4, doi:10.4153/CJM-1969-011-8:
  // a normal subgroup of scalar level r contains the determinant-one kernel
  // modulo 2^(r+2). Its commutator with GL contains the kernel one level
  // deeper: commutation with diag(-1,1) yields the required elementary
  // matrices, whose normal closure contains the determinant-one kernel.
  // Thus enumerate in the quotient given by the smaller matrix and the
  // full determinant. Keep only normal subgroups of exact scalar level r.
  private static final class Quotient {
    private final int mExponent;
    private final int mModulus;
    private final int mSmall;
    private final int[] mA;
    private final int[] mB;
    private final int[] mC;
    private final int[] mD;
    private final int[] mDet;
    private final int[] mLevel;
    private final int[] mInverse;
    private final int[][] mAction;
    private final Map<Long, Integer> mIndex = new HashMap<>();
    private final int mIdentity;

    private Quotient(final int exponent, final int level, final boolean types) {
      mExponent = exponent;
      mModulus = 1 << exponent;
      mSmall = 1 << Math.min(exponent, level + (types ? 3 : 2));
      final int scalar = 1 << level;
      final int lifts = mSmall / scalar;
      final long matrices = level == 0
        ? 6L * lifts * lifts * lifts * lifts / 16
        : (long) (mSmall / 2) * lifts * lifts * lifts;
      final int size = Math.toIntExact(matrices * (mModulus / mSmall));
      mA = new int[size];
      mB = new int[size];
      mC = new int[size];
      mD = new int[size];
      mDet = new int[size];
      mLevel = new int[size];
      int k = 0;
      for (int a = level == 0 ? 0 : 1; a < mSmall; a += level == 0 ? 1 : 2) {
        for (int b = 0; b < mSmall; b += scalar) {
          for (int c = 0; c < mSmall; c += scalar) {
            for (int d = a % scalar; d < mSmall; d += scalar) {
              final int t = (a * d - b * c) & (mSmall - 1);
              if ((t & 1) == 1) {
                final int first = Math.min(mExponent, Integer.numberOfTrailingZeros(b | c | (a ^ d)));
                for (int det = t; det < mModulus; det += mSmall) {
                  mIndex.put(key(a, b, c, d, det), k);
                  mA[k] = a;
                  mB[k] = b;
                  mC[k] = c;
                  mD[k] = d;
                  mDet[k] = det;
                  mLevel[k++] = first;
                }
              }
            }
          }
        }
      }
      if (k != size) {
        throw new IllegalStateException("Unexpected quotient order");
      }
      mIdentity = index(1, 0, 0, 1, 1);
      mInverse = new int[size];
      mAction = new int[4][size];
      for (int x = 0; x < size; ++x) {
        final int u = inverse(mDet[x], mModulus);
        mInverse[x] = index(u * mD[x], -u * mB[x], -u * mC[x], u * mA[x], u);
        mAction[0][x] = conjugate(1, 1, 0, 1, x);
        mAction[1][x] = conjugate(1, 0, 1, 1, x);
        mAction[2][x] = conjugate(-1, 0, 0, 1, x);
        mAction[3][x] = conjugate(5, 0, 0, 1, x);
      }
    }

    private static int inverse(final int n, final int modulus) {
      int a = n;
      // Newton lifting doubles the number of correct bits each time.
      for (int k = 0; k < 5; ++k) {
        a *= 2 - a * n;
      }
      return a & (modulus - 1);
    }

    private long key(final int a, final int b, final int c, final int d, final int det) {
      return ((((long) a * mSmall + b) * mSmall + c) * mSmall + d) * mModulus + det;
    }

    private int index(final int a, final int b, final int c, final int d, final int det) {
      final int mask = mSmall - 1;
      return mIndex.get(key(a & mask, b & mask, c & mask, d & mask, det & (mModulus - 1)));
    }

    private int multiply(final int x, final int y) {
      return index(mA[x] * mA[y] + mB[x] * mC[y], mA[x] * mB[y] + mB[x] * mD[y],
        mC[x] * mA[y] + mD[x] * mC[y], mC[x] * mB[y] + mD[x] * mD[y], mDet[x] * mDet[y]);
    }

    private int conjugate(final int a, final int b, final int c, final int d, final int x) {
      final int u = inverse(a * d - b * c, mSmall);
      final int w = a * mA[x] + b * mC[x];
      final int y = a * mB[x] + b * mD[x];
      final int z = c * mA[x] + d * mC[x];
      final int v = c * mB[x] + d * mD[x];
      return index(u * (w * d - y * c), u * (y * a - w * b), u * (z * d - v * c), u * (v * a - z * b), mDet[x]);
    }

    private Subgroup extend(final Subgroup old, final int... generators) {
      final BitSet seen = old == null ? new BitSet(mA.length) : (BitSet) old.mSet.clone();
      seen.set(mIdentity);
      final int[] queue = old == null ? new int[mA.length] : Arrays.copyOf(old.mElements, mA.length);
      int end = old == null ? 1 : old.mElements.length;
      if (old == null) {
        queue[0] = mIdentity;
      }
      int level = old == null ? mExponent : old.mLevel;
      for (int k = 0; k < end; ++k) {
        final int x = queue[k];
        level = Math.min(level, mLevel[x]);
        for (final int g : generators) {
          final int y = multiply(x, g);
          if (!seen.get(y)) {
            seen.set(y);
            queue[end++] = y;
          }
        }
        for (final int[] action : mAction) {
          final int y = action[x];
          if (!seen.get(y)) {
            seen.set(y);
            queue[end++] = y;
          }
        }
      }
      final int len = old == null ? 0 : old.mGenerators.length;
      final int[] all = old == null ? generators : Arrays.copyOf(old.mGenerators, len + generators.length);
      if (old != null) {
        System.arraycopy(generators, 0, all, len, generators.length);
      }
      return new Subgroup(seen, Arrays.copyOf(queue, end), all, level);
    }

    private List<Subgroup> normalSubgroups() {
      final Map<BitSet, Subgroup> principal = new LinkedHashMap<>();
      final BitSet seen = new BitSet(mA.length);
      seen.set(mIdentity);
      final int[] queue = new int[mA.length];
      for (int x = seen.nextClearBit(0); x < mA.length; x = seen.nextClearBit(x + 1)) {
        queue[0] = x;
        seen.set(x);
        int end = 1;
        for (int k = 0; k < end; ++k) {
          for (final int[] action : mAction) {
            final int y = action[queue[k]];
            if (!seen.get(y)) {
              seen.set(y);
              queue[end++] = y;
            }
          }
        }
        final Subgroup s = extend(null, x);
        principal.putIfAbsent(s.mSet, s);
      }
      final List<Subgroup> groups = new ArrayList<>();
      final Map<BitSet, Subgroup> known = new HashMap<>();
      final Subgroup trivial = extend(null);
      groups.add(trivial);
      known.put(trivial.mSet, trivial);
      for (int k = 0; k < groups.size(); ++k) {
        final Subgroup a = groups.get(k);
        for (final Subgroup b : principal.values()) {
          if (!a.mSet.get(b.mGenerators[0])) {
            final Subgroup next = extend(a, b.mGenerators);
            if (known.putIfAbsent(next.mSet, next) == null) {
              groups.add(next);
            }
          }
        }
      }
      return groups;
    }

    private List<Z> abelianType(final Subgroup s) {
      final BitSet commutators = new BitSet(mA.length);
      for (final int x : s.mGenerators) {
        for (final int[] action : mAction) {
          commutators.set(multiply(action[x], mInverse[x]));
        }
      }
      commutators.clear(mIdentity);
      final Subgroup commutator = extend(null, commutators.stream().toArray());
      final int[] powers = s.mElements.clone();
      final List<Integer> ranks = new ArrayList<>();
      for (int previous = 0; ; ) {
        int killed = 0;
        for (int k = 0; k < powers.length; ++k) {
          powers[k] = multiply(powers[k], powers[k]);
          if (commutator.mSet.get(powers[k])) {
            ++killed;
          }
        }
        final int order = killed / commutator.mElements.length;
        final int rank = Integer.numberOfTrailingZeros(order);
        if (rank == previous) {
          if (killed != powers.length) {
            throw new IllegalStateException("Quotient is not a 2-group");
          }
          break;
        }
        ranks.add(rank - previous);
        previous = rank;
      }
      final List<Z> type = new ArrayList<>();
      for (int k = 0; k < ranks.size(); ++k) {
        final int next = k + 1 < ranks.size() ? ranks.get(k + 1) : 0;
        for (int j = next; j < ranks.get(k); ++j) {
          type.add(Z.ONE.shiftLeft(k + 1));
        }
      }
      return type;
    }
  }

  static Map<List<Z>, Long> count(final int exponent, final boolean types) {
    if (exponent >= 15) {
      throw new UnsupportedOperationException("Quotient is too large");
    }
    final Map<List<Z>, Long> counts = new HashMap<>();
    for (int r = 0; r <= exponent; ++r) {
      final Quotient quotient = new Quotient(exponent, r, types);
      for (final Subgroup s : quotient.normalSubgroups()) {
        if (s.mLevel == r) {
          counts.merge(types ? quotient.abelianType(s) : List.of(), 1L, Long::sum);
        }
      }
    }
    return counts;
  }
}
