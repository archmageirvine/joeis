package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A000409 Singular n X <code>n (0</code>,1)-matrices: the number of n X <code>n (0</code>,1)-matrices having distinct, nonzero ordered rows, but having at least two equal columns or at least one zero column.
 * @author Sean A. Irvine
 */
public class A000409 implements Sequence {

  private int mN = 1;
  private final MemoryFactorial mF = new MemoryFactorial();

  private Z poweredBinomial(final int k, final int n) {
    // compute C(2^k-1,n)
    Z prod = Z.ONE;
    final Z v = Z.ONE.shiftLeft(k);
    for (int j = 1; j <= n; ++j) {
      prod = prod.multiply(v.subtract(j));
    }
    return prod.divide(mF.factorial(n));
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.subtract(Stirling.firstKind(mN + 1, k + 1)
                         .multiply(poweredBinomial(k, mN)));
    }
    return sum;
  }
}

