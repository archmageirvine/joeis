package irvine.oeis.a020;

import irvine.math.partitions.IntegerComposition;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020879 Number of elementary edge-subgraphs in Moebius ladder M_n.
 * @author Sean A. Irvine
 */
public class A020879 implements Sequence {

  // Theorem 21.1 in J. P. McSorley, Counting structures in the Moebius ladder, Discrete Math., 184 (1998), 137-164.
  // todo Note does not produce a(5) = 602
  // todo Similarly a(5)=81 not produced by A20880

  private int mN = 1;

  static boolean isNonConsecutiveCyclic(final int k, final long n) {
    final int bits = Long.bitCount(n);
    if (bits <= 1) {
      return true;
    }
    final long mask = (1L << bits) - 1;
    final long carryBit = 1L << k;
    long m = n;
    for (int j = 0; j < k; ++j) {
      if ((m & mask) == mask) {
        return false;
      }
      m <<= 1;
      if ((m & carryBit) != 0) {
        m |= 1;
        m &= carryBit - 1;
      }
    }
    return true;
  }

  protected Z delta(final int n) {
    return Fibonacci.fibonacci(n);
  }

  protected Z zeroCase(final int n) {
    return Fibonacci.lucas(2 * n).add(1);
  }

  private Z ee(final int n, final int k) {
    if (k == 0) {
      return zeroCase(n);
    }
    Z sum = Z.ZERO;
    final IntegerComposition ic = new IntegerComposition(n, k);
    int[] x;
    while ((x = ic.next()) != null) {
      for (long setN = 0; setN < (1L << k) - 1; ++setN) {
        if (isNonConsecutiveCyclic(k, setN)) {
          long b = 1;
          Z prod = Z.ONE;
          for (int j = 0; j < k; ++j, b <<= 1) {
            if ((setN & b) == 0) {
              prod = prod.multiply(delta(x[j]));
            }
          }
          sum = sum.add(prod.square());
        }
      }
      if ((k & 1) == 1) {
        Z prod = Z.ONE;
        for (int j = 0; j < k; ++j) {
          prod = prod.multiply(delta(x[j]));
        }
        sum = sum.add(prod.multiply2());
      }
    }
    System.out.println("ee(" + n + "," + k + ")=" + sum.multiply(n).divide(k));
    assert sum.multiply(n).mod(k) == 0;
    return sum.multiply(n).divide(k);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(ee(mN, k));
    }
    return sum;
  }
}
