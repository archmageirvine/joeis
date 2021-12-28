package irvine.oeis.a101;

import irvine.math.z.Z;

/**
 * A101625 A bisection of the Stern-Jacobsthal numbers.
 * a(0)=0, a(1)=1, a(n) = a(n-1) XOR (a(n-2)*4).
 * @author Georg Fischer
 */
public class A101625 extends A101624 {

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      mAn2 = Z.ZERO;
      return mAn2;
    } else if (mN == 1) {
      mAn1 = Z.ONE;
      return mAn1;
    } else {
      Z result = mAn1.xor(mAn2.multiply(Z.FOUR));
      mAn2 = mAn1;
      mAn1 = result;
      return result;
    }
  }
}
