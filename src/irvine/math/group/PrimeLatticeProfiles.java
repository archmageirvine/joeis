package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Local elementary divisors of invariant lattices, up to homothety.
 * @author Gregory Morse
 */
final class PrimeLatticeProfiles {

  private PrimeLatticeProfiles() { }

  static final class Fingerprint {
    private final Z mDeterminant;
    private final boolean mEven;

    private Fingerprint(final Z determinant, final boolean even) {
      mDeterminant = determinant;
      mEven = even;
    }

    boolean isEvenUnimodular() {
      return mEven && mDeterminant.isOne();
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Fingerprint && mDeterminant.equals(((Fingerprint) obj).mDeterminant)
        && mEven == ((Fingerprint) obj).mEven;
    }

    @Override
    public int hashCode() {
      return Objects.hash(mDeterminant, mEven);
    }
  }

  static Z[][] primitive(final Q[][] form) {
    Z lcm = Z.ONE;
    for (final Q[] row : form) {
      for (final Q entry : row) {
        lcm = lcm.divide(lcm.gcd(entry.den())).multiply(entry.den());
      }
    }
    final int n = form.length;
    final Z[][] integral = new Z[n][n];
    Z content = Z.ZERO;
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        integral[i][j] = form[i][j].num().multiply(lcm.divide(form[i][j].den()));
        content = content.gcd(integral[i][j].abs());
      }
    }
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        integral[i][j] = integral[i][j].divide(content);
      }
    }
    return integral;
  }

  static Fingerprint fingerprint(final Q[][] form) {
    return fingerprint(primitive(form));
  }

  static Fingerprint fingerprint(final Z[][] matrix) {
    final int n = matrix.length;
    final Z[][] integral = Arrays.stream(matrix).map(Z[]::clone).toArray(Z[][]::new);
    boolean even = true;
    for (int i = 0; i < n; ++i) {
      even &= integral[i][i].isEven();
    }
    Z previous = Z.ONE;
    for (int k = 0; k + 1 < n; ++k) {
      final Z pivot = integral[k][k];
      for (int i = k + 1; i < n; ++i) {
        for (int j = k + 1; j < n; ++j) {
          integral[i][j] = integral[i][j].multiply(pivot).subtract(integral[i][k].multiply(integral[k][j])).divide(previous);
        }
      }
      previous = pivot;
    }
    return new Fingerprint(integral[n - 1][n - 1], even);
  }

  private static int valuation(Z a, final int prime) {
    int count = 0;
    a = a.abs();
    while (a.mod(prime) == 0) {
      a = a.divide(prime);
      ++count;
    }
    return count;
  }

  static List<Integer> elementaryDivisors(final Q[][] form, final int prime) {
    final int n = form.length;
    final Q[][] a = Arrays.stream(form).map(Q[]::clone).toArray(Q[][]::new);
    final List<Integer> result = new ArrayList<>();
    int first = 0;
    for (int k = 0; k < n; ++k) {
      int px = -1;
      int py = -1;
      int best = Integer.MAX_VALUE;
      for (int i = k; i < n; ++i) {
        for (int j = k; j < n; ++j) {
          if (a[i][j].signum() != 0) {
            final int valuation = valuation(a[i][j].num(), prime) - valuation(a[i][j].den(), prime);
            if (valuation < best) {
              best = valuation;
              px = i;
              py = j;
            }
          }
        }
      }
      if (px < 0) {
        throw new IllegalArgumentException("Singular lattice form");
      }
      if (k == 0) {
        first = best;
      }
      result.add(best - first);
      final Q[] row = a[px];
      a[px] = a[k];
      a[k] = row;
      for (int i = k; i < n; ++i) {
        final Q x = a[i][k];
        a[i][k] = a[i][py];
        a[i][py] = x;
      }
      final Q pivot = a[k][k];
      for (int i = k + 1; i < n; ++i) {
        if (a[i][k].signum() != 0) {
          final Q quotient = a[i][k].divide(pivot);
          for (int j = k + 1; j < n; ++j) {
            if (a[k][j].signum() != 0) {
              a[i][j] = a[i][j].subtract(quotient.multiply(a[k][j]));
            }
          }
        }
      }
    }
    return result;
  }

  private static int[][] modularAction(final Z[][] basis, final Z[][] a, final int p) {
    final int n = a.length;
    final Z modulus = Z.valueOf(p);
    final int[][] result = new int[n][n];
    for (int i = 0; i < n; ++i) {
      final Z[] image = new Z[n];
      Arrays.fill(image, Z.ZERO);
      for (int k = i; k < n; ++k) {
        if (!basis[i][k].isZero()) {
          for (int j = 0; j < n; ++j) {
            if (!a[k][j].isZero()) {
              image[j] = image[j].add(basis[i][k].multiply(a[k][j]));
            }
          }
        }
      }
      for (int j = 0; j < n; ++j) {
        if (!image[j].mod(basis[j][j]).isZero()) {
          throw new IllegalStateException("An invariant lattice has nonintegral action");
        }
        final Z x = image[j].divide(basis[j][j]);
        result[i][j] = x.mod(modulus).intValueExact();
        if (!x.isZero()) {
          for (int k = j + 1; k < n; ++k) {
            image[k] = image[k].subtract(x.multiply(basis[j][k]));
          }
        }
      }
    }
    return result;
  }

  private static Z[][] neighbor(final Z[][] basis, final int[][] subspace, final int prime) {
    final int n = basis.length;
    final int[][] pivots = new int[n][];
    for (final int[] row : subspace) {
      int pivot = 0;
      while (row[pivot] == 0) {
        ++pivot;
      }
      pivots[pivot] = row;
    }
    final Z[][] result = new Z[n][n];
    for (int i = 0; i < n; ++i) {
      final int[] row = pivots[i];
      if (row == null) {
        for (int j = 0; j < n; ++j) {
          result[i][j] = basis[i][j].multiply(prime);
        }
      } else {
        result[i] = basis[i].clone();
        for (int j = i + 1; j < n; ++j) {
          if (row[j] != 0) {
            for (int k = j; k < n; ++k) {
              result[i][k] = result[i][k].add(basis[j][k].multiply(row[j]));
            }
          }
        }
      }
    }
    for (int j = 0; j < n; ++j) {
      for (int i = 0; i < j; ++i) {
        final Z x = result[i][j].subtract(result[i][j].mod(result[j][j])).divide(result[j][j]);
        if (!x.isZero()) {
          for (int k = j; k < n; ++k) {
            result[i][k] = result[i][k].subtract(x.multiply(result[j][k]));
          }
        }
      }
    }
    while (Arrays.stream(result).flatMap(Arrays::stream).allMatch(x -> x.mod(prime) == 0)) {
      for (int i = 0; i < n; ++i) {
        for (int j = i; j < n; ++j) {
          result[i][j] = result[i][j].divide(prime);
        }
      }
    }
    return result;
  }

  private static Q[][] gram(final Z[][] basis, final Q[][] a) {
    final int n = basis.length;
    final Q[][] b = Arrays.stream(basis).map(row -> Arrays.stream(row).map(Q::new).toArray(Q[]::new)).toArray(Q[][]::new);
    final Q[][] transposed = new Q[n][n];
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        transposed[i][j] = b[j][i];
      }
    }
    return RationalGroupContainment.product(RationalGroupContainment.product(b, a), transposed);
  }

  private static Z[][][] integral(final Q[][][] generators, final int n) {
    final Z[][][] gen = new Z[generators.length][n][n];
    for (int k = 0; k < generators.length; ++k) {
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
          if (!generators[k][i][j].isInteger()) {
            return null;
          }
          gen[k][i][j] = generators[k][i][j].toZ();
        }
      }
    }
    return gen;
  }

  private static Z[][] identity(final int n) {
    final Z[][] identity = new Z[n][n];
    for (int i = 0; i < n; ++i) {
      Arrays.fill(identity[i], Z.ZERO);
      identity[i][i] = Z.ONE;
    }
    return identity;
  }

  private static Optional<List<Z[][]>> lattices(final Z[][][] generators, final int n, final int[] primes,
                                                final int capacity, final long budget) {
    return lattices(generators, n, primes, capacity, budget, UnaryOperator.identity());
  }

  private static Optional<List<Z[][]>> lattices(final Z[][][] generators, final int n, final int[] primes,
                                                final int capacity, final long budget, final UnaryOperator<Z[][]> normalize) {
    return lattices(generators, n, primes, capacity, budget, normalize, null);
  }

  private static Q[][] rationals(final Z[][] matrix) {
    return Arrays.stream(matrix).map(row -> Arrays.stream(row).map(Q::new).toArray(Q[]::new)).toArray(Q[][]::new);
  }

  private static Optional<List<Z[][]>> lattices(final Z[][][] generators, final int n, final int[] primes,
                                                final int capacity, final long budget, final UnaryOperator<Z[][]> normalize,
                                                final Z[][] commutingOperator) {
    final Z[][] identity = identity(n);
    final List<Z[][]> queue = new ArrayList<>();
    final Set<String> seen = new HashSet<>();
    queue.add(normalize.apply(identity));
    seen.add(Arrays.deepToString(queue.get(0)));
    // Any local invariant lattice can be scaled into the standard lattice
    // and reached by a chain of maximal invariant sublattices. Below each
    // lattice, the latter are preimages of the maximal submodules mod p.
    for (int k = 0; k < queue.size(); ++k) {
      final Z[][] lattice = queue.get(k);
      for (final int prime : primes) {
        final int[][][] modp = Arrays.stream(generators).map(g -> modularAction(lattice, g, prime)).toArray(int[][][]::new);
        // The commuting operator supplies a possible invariant
        // split only; all homomorphisms to the simple quotients
        // are still computed for the original module.
        final int[][] hint = commutingOperator == null ? null : modularAction(lattice, commutingOperator, prime);
        final Optional<List<int[][]>> maximal = ModularInvariantSubspaces.maximal(modp, prime, budget, hint);
        if (maximal.isEmpty()) {
          return Optional.empty();
        }
        for (final int[][] subspace : maximal.orElseThrow()) {
          final Z[][] next = normalize.apply(neighbor(lattice, subspace, prime));
          if (seen.add(Arrays.deepToString(next))) {
            if (queue.size() >= capacity) {
              return Optional.empty();
            }
            queue.add(next);
          }
        }
      }
    }
    return Optional.of(queue);
  }

  private static Z[][] rowHermite(final Z[][] basis, final int n) {
    final Z[][] rows = Arrays.stream(basis).map(Z[]::clone).toArray(Z[][]::new);
    for (int j = 0; j < n; ++j) {
      int p = j;
      while (p < rows.length && rows[p][j].isZero()) {
        ++p;
      }
      if (p == rows.length) {
        throw new IllegalArgumentException("Rank-deficient lattice");
      }
      Z[] temp = rows[p];
      rows[p] = rows[j];
      rows[j] = temp;
      for (int i = j + 1; i < rows.length; ++i) {
        while (!rows[i][j].isZero()) {
          final Z q = rows[j][j].divide(rows[i][j]);
          for (int k = j; k < n; ++k) {
            rows[j][k] = rows[j][k].subtract(q.multiply(rows[i][k]));
          }
          temp = rows[j];
          rows[j] = rows[i];
          rows[i] = temp;
        }
      }
      if (rows[j][j].signum() < 0) {
        for (int k = j; k < n; ++k) {
          rows[j][k] = rows[j][k].negate();
        }
      }
      for (int i = 0; i < j; ++i) {
        final Z pval = rows[j][j];
        final Z q = rows[i][j].subtract(rows[i][j].mod(pval)).divide(pval);
        for (int k = j; k < n; ++k) {
          rows[i][k] = rows[i][k].subtract(q.multiply(rows[j][k]));
        }
      }
    }
    final Z[][] small = Arrays.copyOf(rows, n);
    Z content = Z.ZERO;
    for (final Z[] row : small) {
      for (final Z x : row) {
        content = content.gcd(x);
      }
    }
    final Z divisor = content;
    return Arrays.stream(small).map(row -> Arrays.stream(row).map(x -> x.divide(divisor)).toArray(Z[]::new)).toArray(Z[][]::new);
  }

  private static Z[][] product(final Z[][] left, final Z[][] right) {
    final int n = left.length;
    final Z[][] result = new Z[n][n];
    for (int i = 0; i < n; ++i) {
      Arrays.fill(result[i], Z.ZERO);
      for (int k = 0; k < n; ++k) {
        if (!left[i][k].isZero()) {
          for (int j = 0; j < n; ++j) {
            if (!right[k][j].isZero()) {
              result[i][j] = result[i][j].add(left[i][k].multiply(right[k][j]));
            }
          }
        }
      }
    }
    return result;
  }

  private static Z volume(final Z[][] basis) {
    Z determinant = Z.ONE;
    for (int i = 0; i < basis.length; ++i) {
      determinant = determinant.multiply(basis[i][i]);
    }
    return determinant;
  }

  private static Z[][] normalize(final Z[][] basis, final Z[][][] moves) {
    Z[][] best = basis;
    for (;;) {
      Z[][] next = best;
      Z determinant = volume(best);
      for (final Z[][] move : moves) {
        final Z[][] candidate = rowHermite(product(best, move), best.length);
        final Z d = volume(candidate);
        if (d.compareTo(determinant) < 0 || d.equals(determinant) && Arrays.deepToString(candidate).compareTo(Arrays.deepToString(next)) < 0) {
          next = candidate;
          determinant = d;
        }
      }
      if (next == best) {
        return best;
      }
      best = next;
    }
  }

  static Optional<List<Z[][]>> minusSixModels(final Q[][][] generators, final Q[][] form, final Q[][] j,
                                               final int[] primes, final int capacity, final long budget) {
    if (j == null) {
      return Optional.empty();
    }
    final int n = form.length;
    final Q[][] jt = new Q[n][n];
    final Q[][] j2 = RationalGroupContainment.product(j, j);
    for (int a = 0; a < n; ++a) {
      for (int b = 0; b < n; ++b) {
        jt[a][b] = j[b][a];
        if (!j2[a][b].equals(a == b ? new Q(-6) : Q.ZERO)) {
          return Optional.empty();
        }
      }
    }
    final Q[][] left = RationalGroupContainment.product(j, form);
    final Q[][] right = RationalGroupContainment.product(form, jt);
    for (int a = 0; a < n; ++a) {
      for (int b = 0; b < n; ++b) {
        if (!left[a][b].add(right[a][b]).equals(Q.ZERO)) {
          return Optional.empty();
        }
      }
    }
    Z denominator = Z.ONE;
    for (final Q[] row : j) {
      for (final Q value : row) {
        denominator = denominator.lcm(value.den());
      }
    }
    final Z[][] enlarged = Arrays.copyOf(identity(n), 2 * n);
    for (int a = 0; a < n; ++a) {
      enlarged[a][a] = denominator;
      enlarged[n + a] = new Z[n];
      for (int b = 0; b < n; ++b) {
        enlarged[n + a][b] = j[a][b].num().multiply(denominator.divide(j[a][b].den()));
      }
    }
    final Z[][] lattice = rowHermite(enlarged, n);
    final Q[][] basis = Arrays.stream(lattice).map(row -> Arrays.stream(row).map(Q::new).toArray(Q[]::new)).toArray(Q[][]::new);
    final Q[][] back = RationalBlockModels.inverse(basis);
    final Q[][][] transformed = new Q[generators.length][][];
    for (int k = 0; k < generators.length; ++k) {
      transformed[k] = RationalGroupContainment.product(RationalGroupContainment.product(basis, generators[k]), back);
    }
    final Z[][][] gen = integral(transformed, n);
    final Z[][][] scalar = integral(new Q[][][] {RationalGroupContainment.product(RationalGroupContainment.product(basis, j), back)}, n);
    if (gen == null || scalar == null) {
      return Optional.empty();
    }
    final Z[][][] moves = new Z[4][n][n];
    for (int a = 0; a < n; ++a) {
      for (int b = 0; b < n; ++b) {
        final Z x = scalar[0][a][b];
        final long id = a == b ? 1 : 0;
        moves[0][a][b] = x.multiply(2).subtract(id);
        moves[1][a][b] = x.multiply(-2).subtract(id);
        moves[2][a][b] = x.add(id);
        moves[3][a][b] = x.negate().add(id);
      }
    }
    // At the good primes Schur orthogonality gives the maximal
    // matrix order over O_K. The ideal classes of Q(sqrt(-6)) are
    // generated by primes over 2 and 3 by Minkowski's bound, so a
    // K^* scaling leaves only the indicated bad-prime search.
    // The four commuting similarities simply keep that graph small.
    final Q[][] newForm = gram(lattice, form);
    return lattices(gen, n, primes, capacity, budget, b -> normalize(b, moves), scalar[0]).map(list ->
      list.stream().map(b -> primitive(gram(b, newForm))).collect(java.util.stream.Collectors.toList()));
  }

  static Optional<Set<List<Integer>>> profiles(final Q[][][] generators, final Q[][] form, final int prime,
                                               final int capacity, final long budget) {
    final Z[][][] integral = integral(generators, form.length);
    return integral == null ? Optional.empty() : lattices(integral, form.length, new int[] {prime}, capacity, budget).map(list -> {
      final Set<List<Integer>> result = new HashSet<>();
      for (final Z[][] lattice : list) {
        result.add(elementaryDivisors(gram(lattice, form), prime));
      }
      return result;
    });
  }

  static Optional<Set<Fingerprint>> fingerprints(final Q[][][] generators, final Q[][] form, final int[] primes,
                                                  final int capacity, final long budget) {
    return models(generators, form, primes, capacity, budget).map(list -> {
      final Set<Fingerprint> fingerprints = new HashSet<>();
      for (final Z[][] model : list) {
        fingerprints.add(fingerprint(model));
      }
      return fingerprints;
    });
  }

  static Optional<List<Z[][]>> models(final Q[][][] generators, final Q[][] form, final int[] primes,
                                      final int capacity, final long budget) {
    final int n = form.length;
    final Z[][][] gen = integral(generators, n);
    if (gen == null) {
      return Optional.empty();
    }
    boolean absolute = false;
    for (final int p : new int[] {101, 103, 107}) {
      final Z[][] basis = identity(n);
      if (ModularInvariantSubspaces.hasScalarCommutant(Arrays.stream(gen).map(a -> modularAction(basis, a, p)).toArray(int[][][]::new), p, budget)) {
        absolute = true;
        break;
      }
    }
    if (!absolute) {
      return Optional.empty();
    }
    // A scalar commutant modulo p bounds the rational commutant by
    // dimension one. For the resulting absolutely irreducible rational
    // group, matrix-coefficient orthogonality puts |G| times each matrix
    // unit in Z[G]. Away from primes dividing |G| every invariant local
    // lattice is therefore homothetic to the standard one.
    return lattices(gen, n, primes, capacity, budget).map(list -> {
      final List<Z[][]> models = new ArrayList<>();
      final Set<String> seen = new HashSet<>();
      for (final Z[][] lattice : list) {
        final Z[][] matrix = primitive(gram(lattice, form));
        if (seen.add(Arrays.deepToString(matrix))) {
          models.add(matrix);
        }
      }
      return models;
    });
  }
}
