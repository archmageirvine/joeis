package irvine.oeis.a214;
// manually arsimple/prev3 at 2021-11-18 12:14

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A214039 a(n) = a(n-1) - floor((a(n-2) + a(n-3))/2), with a(n)=n for n &lt; 3.
 * @author Georg Fischer
 */
public class A214039 implements Sequence {

  private int mN = -1;
  private Z mAn3 = Z.ZERO;
  private Z mAn2 = Z.ONE;
  private Z mAn1 = Z.TWO;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mAn3;
    } else if (mN == 1) {
      return mAn2;
    } else if (mN == 2) {
      return mAn1;
    } else {
      final Z result = mAn1.subtract(new Q(mAn2.add(mAn3), Z.TWO).floor());
      mAn3 = mAn2;
      mAn2 = mAn1;
      mAn1 = result;
      return mAn1;
    }
  }
}
