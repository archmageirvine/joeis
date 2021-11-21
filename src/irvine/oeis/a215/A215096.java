package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A215096 a(0)=0, a(1)=1, a(n) = n! - a(n-2).
 * @author Georg Fischer
 */
public class A215096 implements Sequence {

  private int mN = -1;
  private Z mAn2 = Z.ZERO;
  private Z mAn1 = Z.ONE;
  private Z mFact = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mAn2;
    } else if (mN == 1) {
      return mAn1;
    } else {
      mFact = mFact.multiply(mN);
      final Z result = mFact.subtract(mAn2);
      ;
      mAn2 = mAn1;
      mAn1 = result;
      return mAn1;
    }
  }
}
