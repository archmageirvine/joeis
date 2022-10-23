package irvine.oeis.a101;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A101624 Stern-Jacobsthal numbers.
 * a(0)=1, a(1)=1, a(n) = a(n-1) XOR (a(n-2)*2).
 * @author Georg Fischer
 */
public class A101624 extends Sequence0 {

  protected int mN;
  protected Z mAn1;
  protected Z mAn2;

  /** Construct the sequence. */
  public A101624() {
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      mAn2 = Z.ONE;
      return mAn2;
    } else if (mN == 1) {
      mAn1 = Z.ONE;
      return mAn1;
    } else {
      final Z result = mAn1.xor(mAn2.multiply2());
      mAn2 = mAn1;
      mAn1 = result;
      return result;
    }
  }
}
