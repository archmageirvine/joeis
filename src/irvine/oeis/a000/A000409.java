package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A000409 Singular n X n (0,1)-matrices: the number of n X n (0,1)-matrices having distinct, nonzero ordered rows, but having at least two equal columns or at least one zero column.
 * @author Sean A. Irvine
 */
public class A000409 extends Sequence2 {

  private int mN = 1;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  private Z poweredBinomial(final int k, final int n) {
    // compute C(2^k-1,n)
    Z prod = Z.ONE;
    final Z v = Z.ONE.shiftLeft(k);
    for (int j = 1; j <= n; ++j) {
      prod = prod.multiply(v.subtract(j));
    }
    return prod.divide(Functions.FACTORIAL.z(n));
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

