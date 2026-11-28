package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.SplittableRandom;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Trace-power obstruction for finite rational groups permuting equal-dimensional blocks.
 * @author Gregory Morse
 */
final class RationalBlockSpectra {

  private static final int DEGREE = 31;
  private static final int PRIME = 67;
  private static final Z MODULUS = Z.valueOf(PRIME);
  private static final int LIMIT = 2 * DEGREE * DEGREE;
  private static final int[] TOTIENT = new int[LIMIT + 1];
  private static final long[][] CYCLOTOMIC = new long[LIMIT + 1][];
  private static final int[] ORDERS;

  static {
    Arrays.setAll(TOTIENT, i -> i);
    for (int p = 2; p <= LIMIT; ++p) {
      if (TOTIENT[p] == p) {
        for (int n = p; n <= LIMIT; n += p) {
          TOTIENT[n] -= TOTIENT[n] / p;
        }
      }
    }
    ORDERS = java.util.stream.IntStream.rangeClosed(1, LIMIT).filter(i -> TOTIENT[i] <= DEGREE).toArray();
    for (final int n : ORDERS) {
      long[] polynomial = new long[n + 1];
      polynomial[n] = 1;
      polynomial[0] = -1;
      for (final int d : ORDERS) {
        if (d >= n) {
          break;
        }
        if (n % d == 0) {
          polynomial = quotient(polynomial, CYCLOTOMIC[d]);
        }
      }
      CYCLOTOMIC[n] = polynomial;
    }
  }

  private RationalBlockSpectra() { }

  private static long[] quotient(final long[] polynomial, final long[] monic) {
    if (polynomial.length < monic.length) {
      return null;
    }
    final long[] quotient = new long[polynomial.length - monic.length + 1];
    final long[] r = polynomial.clone();
    for (int i = quotient.length - 1; i >= 0; --i) {
      final long q = r[i + monic.length - 1];
      quotient[i] = q;
      for (int j = 0; j < monic.length; ++j) {
        r[i + j] = Math.subtractExact(r[i + j], Math.multiplyExact(q, monic[j]));
      }
    }
    return Arrays.stream(r).allMatch(x -> x == 0) ? quotient : null;
  }

  static int[] factors(final int[] traces) {
    final int n = traces.length;
    final long[] coefficients = new long[n + 1];
    coefficients[n] = 1;
    for (int i = 1; i <= n; ++i) {
      long sum = 0;
      for (int j = 1; j <= i; ++j) {
        sum += coefficients[n - i + j] * traces[j - 1];
      }
      if (sum % i != 0) {
        throw new IllegalArgumentException("Nonintegral characteristic polynomial");
      }
      coefficients[n - i] = -sum / i;
    }
    final int[] multiplicities = new int[ORDERS.length];
    long[] r = coefficients;
    for (int i = 0; i < ORDERS.length && r.length > 1; ++i) {
      final long[] phi = CYCLOTOMIC[ORDERS[i]];
      long[] q;
      while ((q = quotient(r, phi)) != null) {
        ++multiplicities[i];
        r = q;
      }
    }
    if (r.length != 1 || r[0] != 1) {
      throw new IllegalArgumentException("Characteristic polynomial is not cyclotomic");
    }
    return multiplicities;
  }

  private static int multiplicity(final int[] factors, final int order) {
    final int k = Arrays.binarySearch(ORDERS, order);
    return k < 0 ? 0 : factors[k];
  }

  static boolean fitsSymmetricTensorTwo(final int[] traces) {
    final int[] f = factors(traces);
    if (Arrays.stream(f).allMatch(k -> (k & 1) == 0)) {
      return true;
    }
    boolean reflection = true;
    boolean rotation = true;
    for (int i = 0; i < ORDERS.length; ++i) {
      final int m = ORDERS[i];
      if (m % 4 == 0) {
        reflection &= (f[i] & 1) == 0;
      } else {
        reflection &= f[i] == multiplicity(f, (m & 1) == 0 ? m / 2 : 2 * m);
      }
      if (m % 9 == 0) {
        rotation &= (f[i] & 1) == 0;
      } else if (m % 3 != 0) {
        rotation &= (f[i] & 1) == 0 && multiplicity(f, 3 * m) >= f[i] / 2;
      }
    }
    return reflection || rotation;
  }

  static int elementOrder(final int[] traces) {
    final int[] f = factors(traces);
    int order = 1;
    for (int i = 0; i < f.length; ++i) {
      if (f[i] != 0) {
        order = Math.multiplyExact(order / gcd(order, ORDERS[i]), ORDERS[i]);
      }
    }
    return order;
  }

  private static String key(final int[] factors) {
    final char[] s = new char[factors.length];
    for (int i = 0; i < s.length; ++i) {
      s[i] = (char) factors[i];
    }
    return new String(s);
  }

  static final class SpectrumTable {
    private final Map<String, Z> mCounts = new HashMap<>();

    SpectrumTable(final int degree, final Z order, final Map<List<Integer>, Z> records) {
      this(degree, order, records, true);
    }

    SpectrumTable(final int degree, final Z order, final Map<List<Integer>, Z> records, final boolean signed) {
      Z sum = Z.ZERO;
      for (final Map.Entry<List<Integer>, Z> entry : records.entrySet()) {
        if (entry.getValue().signum() <= 0) {
          throw new IllegalArgumentException("Nonpositive spectrum multiplicity");
        }
        final int[] f = new int[ORDERS.length];
        int dimension = 0;
        for (final int m : entry.getKey()) {
          final int index = Arrays.binarySearch(ORDERS, m);
          if (index < 0) {
            throw new IllegalArgumentException("Invalid cyclotomic index");
          }
          ++f[index];
          dimension += TOTIENT[m];
        }
        if (dimension != degree || mCounts.putIfAbsent(key(f), entry.getValue()) != null) {
          throw new IllegalArgumentException("Duplicate spectrum or wrong degree");
        }
        sum = sum.add(entry.getValue());
      }
      if (!order.equals(sum)) {
        throw new IllegalArgumentException("Spectrum masses do not sum to the group order");
      }
      if (!signed) {
        return;
      }
      for (final Map.Entry<String, Z> entry : mCounts.entrySet()) {
        final int[] negated = new int[ORDERS.length];
        for (int i = 0; i < ORDERS.length; ++i) {
          final int m = ORDERS[i];
          final int other = m % 4 == 0 ? m : (m & 1) == 0 ? m / 2 : 2 * m;
          negated[Arrays.binarySearch(ORDERS, other)] = entry.getKey().charAt(i);
        }
        if (!entry.getValue().equals(mCounts.get(key(negated)))) {
          throw new IllegalArgumentException("Spectrum table is not invariant under scalar negation");
        }
      }
    }

    boolean contains(final int[] traces) {
      return mCounts.containsKey(key(factors(traces)));
    }

    Z frequency(final int[] traces) {
      return mCounts.getOrDefault(key(factors(traces)), Z.ZERO);
    }

    boolean exceeds(final SpectrumTable other) {
      return mCounts.entrySet().stream().anyMatch(e -> e.getValue().compareTo(other.mCounts.getOrDefault(e.getKey(), Z.ZERO)) > 0);
    }

    LocalHull hull(final int blocks) {
      return new LocalHull(mCounts.keySet(), blocks);
    }

    boolean hasSingleBlockOutside(final LocalHull target, final int degree, final int rank) {
      return hasSpectrum(degree, degree - rank, trace -> !target.fits(trace));
    }

    boolean hasSpectrum(final int degree, final int fixed, final Predicate<int[]> test) {
      for (final String key : mCounts.keySet()) {
        final int[] trace = new int[degree];
        Arrays.fill(trace, fixed);
        for (int i = 0; i < ORDERS.length; ++i) {
          final int multiplicity = key.charAt(i);
          if (multiplicity != 0) {
            for (int k = 1; k <= degree; ++k) {
              trace[k - 1] += multiplicity * ramanujan(ORDERS[i], k);
            }
          }
        }
        if (test.test(trace)) {
          return true;
        }
      }
      return false;
    }

    Z symmetricTensorTwoMass(final int[] trace) {
      Z mass = Z.ZERO;
      for (final Map.Entry<String, Z> entry : mCounts.entrySet()) {
        final int[] powers = new int[trace.length];
        for (int i = 0; i < ORDERS.length; ++i) {
          final int multiplicity = entry.getKey().charAt(i);
          if (multiplicity != 0) {
            for (int k = 1; k <= trace.length; ++k) {
              powers[k - 1] += multiplicity * ramanujan(ORDERS[i], k);
            }
          }
        }
        final int[] multiplicities = {1, 3, 2};
        for (int order = 1; order <= 3; ++order) {
          boolean fits = true;
          for (int k = 1; k <= trace.length; ++k) {
            final int multiplier = k % order == 0 ? 2 : order == 2 ? 0 : -1;
            if (trace[k - 1] != powers[k - 1] * multiplier) {
              fits = false;
              break;
            }
          }
          if (fits) {
            mass = mass.add(entry.getValue().multiply(multiplicities[order - 1]));
          }
        }
      }
      return mass;
    }
  }

  private static int mobius(int n) {
    int sign = 1;
    for (int p = 2; p * p <= n; ++p) {
      if (n % p == 0) {
        n /= p;
        if (n % p == 0) {
          return 0;
        }
        sign = -sign;
      }
    }
    return n == 1 ? sign : -sign;
  }

  private static int ramanujan(final int m, final int k) {
    int sum = 0;
    for (int d = 1; d <= k; ++d) {
      if (m % d == 0 && k % d == 0) {
        sum += d * mobius(m / d);
      }
    }
    return sum;
  }

  // Signed projective-line action of C2 x PGL(2,p). Normalize the
  // first nonzero entry of each projective matrix to one.
  static SpectrumTable signedProjectiveLine(final int p) {
    final int[] inverse = new int[p];
    for (int a = 1; a < p; ++a) {
      for (int b = 1; b < p; ++b) {
        if (a * b % p == 1) {
          inverse[a] = b;
          break;
        }
      }
    }
    final int rank = p + 1;
    final Map<List<Integer>, Z> result = new HashMap<>();
    for (int a = 0; a < p; ++a) {
      for (int b = 0; b < p; ++b) {
        for (int c = 0; c < p; ++c) {
          for (int d = 0; d < p; ++d) {
            if ((a != 0 ? a : b != 0 ? b : c != 0 ? c : d) != 1 || (a * d - b * c) % p == 0) {
              continue;
            }
            final int[] perm = new int[rank];
            for (int i = 0; i < p; ++i) {
              final int den = (c * i + d) % p;
              perm[i] = den == 0 ? p : (a * i + b) * inverse[den] % p;
            }
            perm[p] = c == 0 ? p : a * inverse[c] % p;
            final int[] powers = new int[rank];
            final boolean[] seen = new boolean[rank];
            for (int i = 0; i < rank; ++i) {
              if (!seen[i]) {
                int length = 0;
                for (int j = i; !seen[j]; j = perm[j]) {
                  seen[j] = true;
                  ++length;
                }
                for (int k = length; k <= rank; k += length) {
                  powers[k - 1] += length;
                }
              }
            }
            result.merge(cyclotomicIndices(powers), Z.ONE, Z::add);
            for (int k = 0; k < rank; k += 2) {
              powers[k] = -powers[k];
            }
            result.merge(cyclotomicIndices(powers), Z.ONE, Z::add);
          }
        }
      }
    }
    return new SpectrumTable(rank, Z.valueOf(2L * p * (p * p - 1L)), result);
  }

  static Z[][] e8TensorA2() {
    final int[][] roots = new int[8][8];
    for (int i = 0; i < 8; ++i) {
      roots[i][i] = 2;
    }
    for (int i = 0; i < 6; ++i) {
      roots[i][i + 1] = -1;
      roots[i + 1][i] = -1;
    }
    roots[2][7] = -1;
    roots[7][2] = -1;
    final Z[][] tensor = new Z[16][16];
    for (int i = 0; i < 16; ++i) {
      for (int j = 0; j < 16; ++j) {
        tensor[i][j] = Z.valueOf(roots[i / 2][j / 2] * ((i & 1) == (j & 1) ? 2 : -1));
      }
    }
    return tensor;
  }

  static List<Integer> cyclotomicIndices(final int[] traces) {
    final int[] f = factors(traces);
    final List<Integer> result = new ArrayList<>();
    for (int i = 0; i < f.length; ++i) {
      for (int k = 0; k < f[i]; ++k) {
        result.add(ORDERS[i]);
      }
    }
    return result;
  }

  private static int gcd(int a, int b) {
    while (b != 0) {
      final int c = a % b;
      a = b;
      b = c;
    }
    return a;
  }

  private static final class Factor {
    private final int mDegree;
    private final int[] mExpanded;

    private Factor(final int degree, final int[] expanded) {
      mDegree = degree;
      mExpanded = expanded;
    }
  }

  private static boolean choose(final List<Factor> factors, final int at, final int remainingDegree,
                                final int[] left, final int remainingBlocks, final int cycle,
                                final int block, final List<List<Factor>> options, final Set<String> failed) {
    if (remainingDegree == 0) {
      return fit(left, remainingBlocks - cycle, cycle, block, options, failed);
    }
    if (at == factors.size()) {
      return false;
    }
    final Factor f = factors.get(at);
    int limit = remainingDegree / f.mDegree;
    for (final int i : f.mExpanded) {
      limit = Math.min(limit, left[i]);
    }
    for (int k = 0; k <= limit; ++k) {
      if (choose(factors, at + 1, remainingDegree - k * f.mDegree, left, remainingBlocks, cycle, block, options, failed)) {
        for (final int i : f.mExpanded) {
          left[i] += k;
        }
        return true;
      }
      if (k < limit) {
        for (final int i : f.mExpanded) {
          --left[i];
        }
      }
    }
    for (final int i : f.mExpanded) {
      left[i] += limit;
    }
    return false;
  }

  private static boolean fit(final int[] left, final int remainingBlocks, final int minimumCycle,
                             final int block, final List<List<Factor>> options, final Set<String> failed) {
    if (remainingBlocks == 0) {
      return Arrays.stream(left).allMatch(k -> k == 0);
    }
    final String state = minimumCycle + ":" + Arrays.toString(left);
    if (!failed.add(state)) {
      return false;
    }
    for (int len = minimumCycle; len <= remainingBlocks; ++len) {
      if ((len == remainingBlocks || 2 * len <= remainingBlocks)
        && choose(options.get(len), 0, block, left, remainingBlocks, len, block, options, failed)) {
        return true;
      }
    }
    return false;
  }

  static boolean canPermuteBlocks(final int[] traces, final int block) {
    final int n = traces.length;
    final int count = n / block;
    final int[] left = factors(traces);
    final List<List<Factor>> options = new ArrayList<>();
    options.add(List.of());
    for (int cycle = 1; cycle <= count; ++cycle) {
      final int len = cycle;
      final List<Factor> choices = new ArrayList<>();
      for (final int m : ORDERS) {
        if (TOTIENT[m] <= block) {
          // A root of order e has a len-th power of order e/gcd(e,len).
          final int[] expanded = java.util.stream.IntStream.range(0, ORDERS.length).filter(i -> ORDERS[i] / gcd(ORDERS[i], len) == m).toArray();
          if (expanded.length > 0 && Arrays.stream(expanded).allMatch(i -> left[i] > 0)) {
            choices.add(new Factor(TOTIENT[m], expanded));
          }
        }
      }
      options.add(choices);
    }
    return fit(left, count, 1, block, options, new HashSet<>());
  }

  static int[] multiply(final int[] a, final int[] b, final int n) {
    final int[] c = new int[a.length];
    for (int i = 0; i < n; ++i) {
      for (int k = 0; k < n; ++k) {
        final int value = a[i * n + k];
        if (value != 0) {
          for (int j = 0; j < n; ++j) {
            c[i * n + j] += value * b[k * n + j];
          }
        }
      }
    }
    for (int i = 0; i < c.length; ++i) {
      c[i] %= PRIME;
    }
    return c;
  }

  static int residue(final Q x) {
    return x.isInteger() ? x.toZ().mod(MODULUS).intValueExact() : x.den().mod(PRIME) == 0 ? -1 : x.num().mod(MODULUS)
      .multiply(x.den().modPow(PRIME - 2L, MODULUS)).mod(MODULUS).intValueExact();
  }

  private static void sample(final int[] a, final int n, final Set<String> seen, final List<int[]> spectra) {
    if (!seen.add(Arrays.toString(a))) {
      return;
    }
    spectra.add(traces(a, n));
  }

  static int[] traces(final int[] a, final int n) {
    final int[] traces = new int[n];
    int[] power = a;
    for (int k = 0; k < n; ++k) {
      int trace = 0;
      for (int j = 0; j < n; ++j) {
        trace += power[j * (n + 1)];
      }
      trace %= PRIME;
      trace = trace <= n ? trace : trace - PRIME;
      if (Math.abs(trace) > n) {
        throw new IllegalArgumentException("Trace is not that of a finite rational group");
      }
      traces[k] = trace;
      if (k + 1 < n) {
        power = multiply(power, a, n);
      }
    }
    return traces;
  }

  static List<int[]> sampleSpectra(final Q[][][] generators, final int count) {
    final int n = generators[0].length;
    final int[][] modular = new int[generators.length][n * n];
    for (int k = 0; k < generators.length; ++k) {
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
          final Q a = generators[k][i][j];
          final int value = residue(a);
          if (value < 0) {
            return List.of();
          }
          modular[k][i * n + j] = value;
        }
      }
    }
    final List<int[]> result = new ArrayList<>();
    final Set<String> seen = new HashSet<>();
    for (final int[] a : modular) {
      sample(a, n, seen, result);
    }
    // Sampling only chooses words. Every trace of every chosen word
    // is exact: for n <= 31 its modulus-67 residue determines it.
    final SplittableRandom random = new SplittableRandom(0);
    for (int i = 0; i < count; ++i) {
      int[] word = modular[random.nextInt(modular.length)];
      final int length = 2 + random.nextInt(15);
      for (int j = 1; j < length; ++j) {
        word = multiply(word, modular[random.nextInt(modular.length)], n);
      }
      sample(word, n, seen, result);
    }
    return result;
  }

  private static int[] components(final Q[][] form) {
    final int n = form.length;
    final int[] labels = new int[n];
    final int[] queue = new int[n];
    Arrays.fill(labels, -1);
    int block = 0;
    int count = 0;
    for (int x = 0; x < n; ++x) {
      if (labels[x] < 0) {
        queue[0] = x;
        labels[x] = count;
        int end = 1;
        for (int u = 0; u < end; ++u) {
          for (int y = 0; y < n; ++y) {
            if (labels[y] < 0 && form[queue[u]][y].signum() != 0) {
              labels[y] = count;
              queue[end++] = y;
            }
          }
        }
        if (count == 0) {
          block = end;
        } else if (end != block) {
          return null;
        }
        ++count;
      }
    }
    return count > 1 ? labels : null;
  }

  private static int[][] actions(final Q[][][] generators, final int[] labels, final int count) {
    final int n = labels.length;
    final int[][] result = new int[generators.length][count];
    for (int k = 0; k < generators.length; ++k) {
      final Q[][] g = generators[k];
      final int[] action = result[k];
      Arrays.fill(action, -1);
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
          if (g[i][j].signum() != 0) {
            final int target = labels[j];
            if (action[labels[i]] >= 0 && action[labels[i]] != target) {
              return null;
            }
            action[labels[i]] = target;
          }
        }
      }
      if (Arrays.stream(action).distinct().count() != count) {
        return null;
      }
    }
    return result;
  }

  static int coordinateBlock(final Q[][][] generators, final Q[][] form) {
    final int[] labels = components(form);
    if (labels == null) {
      return 0;
    }
    final int count = 1 + Arrays.stream(labels).max().orElseThrow();
    return actions(generators, labels, count) == null ? 0 : form.length / count;
  }

  static boolean hasEvenUnimodularBlocks(final Q[][][] generators, final Q[][] form, final int size) {
    final int[] labels = components(form);
    if (labels == null || !integral(generators)) {
      return false;
    }
    final int count = 1 + Arrays.stream(labels).max().orElseThrow();
    if (size * count != form.length || actions(generators, labels, count) == null) {
      return false;
    }
    for (int c = 0; c < count; ++c) {
      final int block = c;
      final int[] indices = java.util.stream.IntStream.range(0, labels.length).filter(i -> labels[i] == block).toArray();
      final Q[][] sub = new Q[size][size];
      for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size; ++j) {
          sub[i][j] = form[indices[i]][indices[j]];
        }
      }
      if (!PrimeLatticeProfiles.fingerprint(sub).isEvenUnimodular()) {
        return false;
      }
    }
    return true;
  }

  private static boolean integral(final Q[][][] generators) {
    for (final Q[][] g : generators) {
      for (final Q[] row : g) {
        for (final Q x : row) {
          if (!x.isInteger()) {
            return false;
          }
        }
      }
    }
    return true;
  }

  static Z[][] simplexGram(final int rank) {
    final Z[][] gram = new Z[rank][rank];
    for (int i = 0; i < rank; ++i) {
      for (int j = 0; j < rank; ++j) {
        gram[i][j] = i == j ? Z.TWO : Math.abs(i - j) == 1 ? Z.NEG_ONE : Z.ZERO;
      }
    }
    return gram;
  }

  static Z[][] tensorGram(final Z[][] left, final Z[][] right) {
    final int n = left.length * right.length;
    final int r = right.length;
    final Z[][] result = new Z[n][n];
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        result[i][j] = left[i / r][j / r].multiply(right[i % r][j % r]);
      }
    }
    return result;
  }

  private static void simplexTraces(final int left, final int minimum, final int[] cycles,
                                    final int degree, final List<int[]> spectra) {
    if (left == 0) {
      final int[] traces = new int[degree];
      for (int k = 1; k <= traces.length; ++k) {
        traces[k - 1] = -1;
        for (int i = 1; i < cycles.length; ++i) {
          if (k % i == 0) {
            traces[k - 1] += i * cycles[i];
          }
        }
      }
      spectra.add(traces);
      return;
    }
    for (int i = minimum; i <= left; ++i) {
      ++cycles[i];
      simplexTraces(left - i, i, cycles, degree, spectra);
      --cycles[i];
    }
  }

  static Set<String> signedSimplexTensor(final int a, final int b) {
    final int degree = a * b;
    final List<int[]> left = new ArrayList<>();
    final List<int[]> right = new ArrayList<>();
    simplexTraces(a + 1, 1, new int[a + 2], degree, left);
    simplexTraces(b + 1, 1, new int[b + 2], degree, right);
    final Set<String> result = new HashSet<>();
    for (final int[] x : left) {
      for (final int[] y : right) {
        final int[] traces = new int[degree];
        for (int i = 0; i < degree; ++i) {
          traces[i] = x[i] * y[i];
        }
        result.add(Arrays.toString(traces));
        for (int i = 0; i < degree; i += 2) {
          traces[i] = -traces[i];
        }
        result.add(Arrays.toString(traces));
      }
    }
    return result;
  }

  private static void simplexSpectra(final int left, final int minimum, final int[] cycles, final Set<String> spectra) {
    if (left == 0) {
      final int[] traces = new int[cycles.length - 2];
      for (int k = 1; k <= traces.length; ++k) {
        int trace = -1;
        for (int i = 1; i < cycles.length; ++i) {
          if (k % i == 0) {
            trace += i * cycles[i];
          }
        }
        traces[k - 1] = trace;
      }
      spectra.add(key(factors(traces)));
      for (int i = 0; i < traces.length; i += 2) {
        traces[i] = -traces[i];
      }
      spectra.add(key(factors(traces)));
      return;
    }
    for (int i = minimum; i <= left; ++i) {
      ++cycles[i];
      simplexSpectra(left - i, i, cycles, spectra);
      --cycles[i];
    }
  }

  static Optional<LocalHull> simplexHull(final Q[][][] generators, final Q[][] form) {
    final int[] labels = components(form);
    if (labels == null || !integral(generators)) {
      return Optional.empty();
    }
    final int count = 1 + Arrays.stream(labels).max().orElseThrow();
    final int size = labels.length / count;
    if (actions(generators, labels, count) == null || size > 15) {
      return Optional.empty();
    }
    final Z[][] standard = simplexGram(size);
    for (int c = 0; c < count; ++c) {
      final int block = c;
      final int[] indices = java.util.stream.IntStream.range(0, labels.length).filter(i -> labels[i] == block).toArray();
      final Q[][] sub = new Q[size][size];
      for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size; ++j) {
          sub[i][j] = form[indices[i]][indices[j]];
        }
      }
      if (!RationalLatticeIsometry.matches(PrimeLatticeProfiles.primitive(sub), standard, 8000, 1500000).orElse(false)) {
        return Optional.empty();
      }
    }
    // Isometries of A_n act as signed permutations of its simplex
    // vertices. Each partition gives a cycle type, with one deleted
    // copy of the trivial eigenvalue and an optional overall sign.
    final Set<String> spectra = new HashSet<>();
    simplexSpectra(size + 1, 1, new int[size + 2], spectra);
    return Optional.of(new LocalHull(spectra, count));
  }

  static int[] inverse(final int[] a, final int n) {
    final int[][] rows = new int[n][2 * n];
    for (int i = 0; i < n; ++i) {
      System.arraycopy(a, n * i, rows[i], 0, n);
      rows[i][n + i] = 1;
    }
    for (int i = 0; i < n; ++i) {
      int pivot = i;
      while (pivot < n && rows[pivot][i] == 0) {
        ++pivot;
      }
      if (pivot == n) {
        return null;
      }
      final int[] t = rows[i];
      rows[i] = rows[pivot];
      rows[pivot] = t;
      final int scale = (int) Z.valueOf(rows[i][i]).modPow(PRIME - 2L, PRIME).longValueExact();
      for (int j = i; j < 2 * n; ++j) {
        rows[i][j] = rows[i][j] * scale % PRIME;
      }
      for (int r = 0; r < n; ++r) {
        if (r != i && rows[r][i] != 0) {
          final int s = rows[r][i];
          for (int j = i; j < 2 * n; ++j) {
            rows[r][j] = Math.floorMod(rows[r][j] - s * rows[i][j], PRIME);
          }
        }
      }
    }
    final int[] result = new int[a.length];
    for (int i = 0; i < n; ++i) {
      System.arraycopy(rows[i], n, result, i * n, n);
    }
    return result;
  }

  static final class LocalHull {
    private final int mBlocks;
    private final Set<String> mLocal;
    private final List<List<int[]>> mChoices = new ArrayList<>();

    private LocalHull(final Set<String> spectra, final int blocks) {
      mBlocks = blocks;
      mLocal = spectra;
      mChoices.add(List.of());
      for (int len = 1; len <= blocks; ++len) {
        final List<int[]> expanded = new ArrayList<>();
        final int[] baseIndices = new int[ORDERS.length];
        for (int i = 0; i < ORDERS.length; ++i) {
          baseIndices[i] = Arrays.binarySearch(ORDERS, ORDERS[i] / gcd(ORDERS[i], len));
        }
        for (final String local : spectra) {
          final int[] factors = new int[ORDERS.length];
          for (int i = 0; i < factors.length; ++i) {
            factors[i] = local.charAt(baseIndices[i]);
          }
          expanded.add(factors);
        }
        mChoices.add(expanded);
      }
    }

    private boolean fit(final int[] left, final int remaining, final int minimum, final Set<String> seen, final int[] work) {
      if (remaining == 0) {
        return Arrays.stream(left).allMatch(x -> x == 0);
      }
      if (!seen.add(minimum + ":" + Arrays.toString(left))) {
        return false;
      }
      for (int len = minimum; len <= remaining; ++len) {
        if (len == remaining || 2 * len <= remaining) {
          for (final int[] choice : mChoices.get(len)) {
            if (++work[0] > 25000) {
              return true; // Exhaustion is inconclusive.
            }
            int i = 0;
            while (i < left.length && choice[i] <= left[i]) {
              ++i;
            }
            if (i == left.length) {
              final int[] next = left.clone();
              for (int j = 0; j < next.length; ++j) {
                next[j] -= choice[j];
              }
              if (fit(next, remaining - len, len, seen, work)) {
                return true;
              }
            }
          }
        }
      }
      return false;
    }

    boolean fits(final int[] trace) {
      return fit(factors(trace), mBlocks, 1, new HashSet<>(), new int[1]);
    }

    boolean fitsCycles(final int[] trace, final int[] cycleLengths) {
      if (Arrays.stream(cycleLengths).sum() != mBlocks) {
        throw new IllegalArgumentException("Cycle lengths do not match the block degree");
      }
      if (mBlocks == 2) {
        return fitsTwo(trace, cycleLengths.length == 1);
      }
      return fitCycles(factors(trace), cycleLengths, 0, new int[1]);
    }

    private boolean fitCycles(final int[] left, final int[] cycleLengths, final int index, final int[] budget) {
      if (index == cycleLengths.length) {
        return Arrays.stream(left).allMatch(x -> x == 0);
      }
      for (final int[] choice : mChoices.get(cycleLengths[index])) {
        if (++budget[0] > 100000) {
          return true; // The bounded test did not exclude this action.
        }
        final int[] rest = new int[left.length];
        int j = 0;
        while (j < left.length && choice[j] <= left[j]) {
          rest[j] = left[j] - choice[j];
          ++j;
        }
        if (j == left.length && fitCycles(rest, cycleLengths, index + 1, budget)) {
          return true;
        }
      }
      return false;
    }

    boolean fitsTwo(final int[] trace, final boolean swap) {
      if (mBlocks != 2) {
        throw new IllegalArgumentException("Not a two-block action");
      }
      final int[] f = factors(trace);
      if (swap) {
        return mChoices.get(2).stream().anyMatch(x -> Arrays.equals(x, f));
      }
      final int[] remaining = new int[f.length];
      for (final int[] x : mChoices.get(1)) {
        int j = 0;
        for (; j < f.length; ++j) {
          remaining[j] = f[j] - x[j];
          if (remaining[j] < 0) {
            break;
          }
        }
        if (j == f.length && mLocal.contains(key(remaining))) {
          return true;
        }
      }
      return false;
    }
  }

  static Optional<LocalHull> localHull(final Q[][][] generators, final Q[][] form) {
    return localHull(generators, form, 8, 4096);
  }

  static Optional<LocalHull> localHull(final Q[][][] generators, final Q[][] form, final int maximumRank, final int limit) {
    final int[] labels = components(form);
    if (labels == null) {
      return Optional.empty();
    }
    final int count = 1 + Arrays.stream(labels).max().orElseThrow();
    final int size = form.length / count;
    final int[][] action = actions(generators, labels, count);
    if (action == null || size > maximumRank) {
      return Optional.empty();
    }
    final int[][] indices = new int[count][size];
    final int[] next = new int[count];
    for (int i = 0; i < labels.length; ++i) {
      indices[labels[i]][next[labels[i]]++] = i;
    }
    final int[][][] maps = new int[generators.length][count][size * size];
    for (int k = 0; k < generators.length; ++k) {
      for (int x = 0; x < count; ++x) {
        for (int i = 0; i < size; ++i) {
          for (int j = 0; j < size; ++j) {
            final Q entry = generators[k][indices[x][i]][indices[action[k][x]][j]];
            final int value = residue(entry);
            if (value < 0) {
              return Optional.empty();
            }
            maps[k][x][i * size + j] = value;
          }
        }
      }
    }
    final int[] identity = new int[size * size];
    for (int i = 0; i < size; ++i) {
      identity[i * (size + 1)] = 1;
    }
    final int[][] transversal = new int[count][];
    transversal[0] = identity;
    final List<Integer> blocks = new ArrayList<>();
    blocks.add(0);
    for (int i = 0; i < blocks.size(); ++i) {
      final int x = blocks.get(i);
      for (int k = 0; k < generators.length; ++k) {
        final int y = action[k][x];
        if (transversal[y] == null) {
          transversal[y] = multiply(transversal[x], maps[k][x], size);
          blocks.add(y);
        }
      }
    }
    if (blocks.size() != count) {
      return Optional.empty();
    }
    final int[][] back = Arrays.stream(transversal).map(t -> inverse(t, size)).toArray(int[][]::new);
    if (Arrays.stream(back).anyMatch(t -> t == null)) {
      return Optional.empty();
    }
    final List<int[]> local = new ArrayList<>();
    final Set<String> seen = new HashSet<>();
    seen.add(Arrays.toString(identity));
    for (int x = 0; x < count; ++x) {
      for (int k = 0; k < generators.length; ++k) {
        final int[] g = multiply(multiply(transversal[x], maps[k][x], size), back[action[k][x]], size);
        if (seen.add(Arrays.toString(g))) {
          local.add(g);
        }
      }
    }
    // Schreier generators of the block stabilizer act on this one
    // block. Their spectra bound the cycle products at every block.
    seen.clear();
    seen.add(Arrays.toString(identity));
    final List<int[]> elements = new ArrayList<>();
    elements.add(identity);
    for (int i = 0; i < elements.size(); ++i) {
      for (final int[] g : local) {
        final int[] h = multiply(elements.get(i), g, size);
        if (seen.add(Arrays.toString(h))) {
          if (elements.size() == limit) {
            return Optional.empty();
          }
          elements.add(h);
        }
      }
    }
    final Set<String> spectra = new HashSet<>();
    for (final int[] g : elements) {
      final int[] f = factors(traces(g, size));
      final char[] exponents = new char[f.length];
      for (int i = 0; i < f.length; ++i) {
        exponents[i] = (char) f[i];
      }
      spectra.add(new String(exponents));
    }
    return Optional.of(new LocalHull(spectra, count));
  }
}
