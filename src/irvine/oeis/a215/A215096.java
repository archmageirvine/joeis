package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A215096 a(0)=0, a(1)=1, a(n) = n! - a(n-2).
 * @author Georg Fischer
 */
public class A215096 implements Sequence {

  private int mN = -1;
  private Z mAn_2 = Z.ZERO;
  private Z mAn_1 = Z.ONE;
  private Z mFact = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mAn_2;
    } else if (mN == 1) {
      return mAn_1;
    } else {
      mFact = mFact.multiply(mN);
      final Z result = mFact.subtract(mAn_2);
      ;
      mAn_2 = mAn_1;
      mAn_1 = result;
      return mAn_1;
    }
  }
}
