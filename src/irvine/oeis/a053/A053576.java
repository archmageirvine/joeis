package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053576 Smallest number whose Euler totient is divisible by 2^n.
 * @author Sean A. Irvine
 */
public class A053576 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
//    if (mN >= 8589934592L) {
//      throw new UnsupportedOperationException();
//    }
    if (++mN > 31) {
      return Z.ONE.shiftLeft(mN + 1);
    }
    Z prod = Z.ONE;
    int k = 1;
    while (k <= mN) {
      if ((mN & k) != 0) {
        prod = prod.multiply(Z.ONE.shiftLeft(k).add(1));
      }
      k <<= 1;
    }
    return prod;
  }
}
