package irvine.oeis.a025;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025165 a(n) = H_n(1) / 2^floor(n/2) where H_n is the n-th Hermite polynomial.
 * @author Sean A. Irvine
 */
public class A025165 implements Sequence {

  // After G. C. Greubel

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.signedAdd((k & 1) == 0, mF.factorial(mN).shiftLeft(mN - 2 * k).divide(mF.factorial(k)).divide(mF.factorial(mN - 2 * k)));
    }
    return sum.shiftRight(mN / 2);
  }
}
