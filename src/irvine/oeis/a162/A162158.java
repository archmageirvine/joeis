package irvine.oeis.a162;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A162158 The number of elements in S_3\det^{-1}(n)/GL(3,\Z), where we take det : M_{3 \x 3}(\Z) \rightarrow \Z.
 * @author Gregory Morse
 */
public class A162158 extends LambdaSequence {

  protected A162158(final int dim) {
    super(1, n -> orbits(dim, n));
  }

  /** Construct the sequence. */
  public A162158() {
    this(3);
  }

  private static Z hyperplanes(final int[] cycles, final Z p) {
    // A stable hyperplane is the kernel of a linear eigenvector in the dual.
    // A cycle of length l contributes one dimension for each l-th root of unity.
    final Z p1 = p.subtract(1);
    Z result = Z.ZERO;
    for (int d = 1; d <= cycles[0]; ++d) {
      if (p1.mod(Z.valueOf(d)).isZero()) {
        int multiplicity = 0;
        for (final int len : cycles) {
          if (len % d == 0) {
            ++multiplicity;
          }
        }
        result = result.add(p.pow(multiplicity).subtract(1).divide(p1).multiply(Functions.PHI.l(d)));
      }
    }
    // Exclude coordinate hyperplanes fixed by this permutation.
    for (final int len : cycles) {
      if (len == 1) {
        result = result.subtract(1);
      }
    }
    return result;
  }

  private static boolean fixed(final long[][] h, final int[] perm, final long[] x) {
    // The columns of the permuted HNF must all belong to the original lattice.
    for (int k = 0; k < h.length; ++k) {
      for (int i = h.length - 1; i >= 0; --i) {
        long v = h[perm[i]][k];
        for (int j = i + 1; j < h.length; ++j) {
          v -= h[i][j] * x[j];
        }
        if (v % h[i][i] != 0) {
          return false;
        }
        x[i] = v / h[i][i];
      }
    }
    return true;
  }

  private static long fill(final long[][] h, final int i, final int j, final int p, final int[] perm, final long[] x) {
    if (i == h.length - 1) {
      return fixed(h, perm, x) ? 1 : 0;
    }
    if (j == h.length) {
      // Each row represents a primitive ray. Equivalently the lattice
      // projects onto each coordinate, so some row entry is a unit mod p.
      for (int k = i; k < h.length; ++k) {
        if (h[i][k] % p != 0) {
          return fill(h, i + 1, i + 2, p, perm, x);
        }
      }
      return 0;
    }
    long sum = 0;
    for (long v = 0; v < h[i][i]; ++v) {
      h[i][j] = v;
      sum += fill(h, i, j + 1, p, perm, x);
    }
    return sum;
  }

  private static long diagonal(final long[][] h, final int row, final int p, final int e, final int[] perm, final long[] x) {
    if (row == h.length - 1) {
      h[row][row] = 1;
      return e == 0 ? fill(h, 0, 1, p, perm, x) : 0;
    }
    long sum = 0;
    long power = 1;
    for (int k = 0; k <= e; ++k) {
      h[row][row] = power;
      sum += diagonal(h, row + 1, p, e - k, perm, x);
      if (k < e) {
        power *= p;
      }
    }
    return sum;
  }

  private static Z allLattices(final int dim, final Z p, final int e) {
    final Z[] counts = new Z[e + 1];
    counts[0] = Z.ONE;
    for (int k = 1; k <= e; ++k) {
      counts[k] = Z.ZERO;
    }
    for (int i = 0; i < dim; ++i) {
      final Z power = p.pow(i);
      for (int k = 1; k <= e; ++k) {
        counts[k] = counts[k].add(counts[k - 1].multiply(power));
      }
    }
    Z sum = counts[e];
    for (int k = 1; k <= Math.min(dim, e); ++k) {
      final Z term = counts[e - k].multiply(Binomial.binomial(dim, k));
      sum = (k & 1) == 0 ? sum.add(term) : sum.subtract(term);
    }
    return sum;
  }

  private static Z orbits(final int dim, final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    final IntegerPartition types = new IntegerPartition(dim);
    final Z factorial = Functions.FACTORIAL.z(dim);
    Z total = Z.ZERO;
    int[] cycles;
    while ((cycles = types.next()) != null) {
      final int[] perm = new int[dim];
      final int[] counts = new int[dim + 1];
      int k = 0;
      Z centralizer = Z.ONE;
      for (final int len : cycles) {
        centralizer = centralizer.multiply((long) len * ++counts[len]);
        for (int j = 0; j < len; ++j) {
          perm[k + j] = k + (j + 1) % len;
        }
        k += len;
      }
      // Primary lattice components are independent and permutation-invariant.
      Z fixed = Z.ONE;
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p);
        if (cycles[0] == 1) {
          fixed = fixed.multiply(allLattices(dim, p, e));
        } else if (e == 1) {
          fixed = fixed.multiply(hyperplanes(cycles, p));
        } else {
          fixed = fixed.multiply(diagonal(new long[dim][dim], 0, p.intValueExact(), e, perm, new long[dim]));
        }
      }
      total = total.add(fixed.multiply(factorial.divide(centralizer)));
    }
    return total.divide(factorial);
  }
}
