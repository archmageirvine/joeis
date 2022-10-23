package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004735 Denominator of average distance traveled by n-dimensional fly.
 * @author Sean A. Irvine
 */
public class A004735 extends Sequence1 {

  private long mN = 0;
  private Q mEven = Q.FOUR;
  private Q mOdd = Q.TWO;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      if (mN > 0) {
        mEven = mEven.multiply(mN);
      }
      mEven = mEven.divide(mN + 1);
      return mEven.den();
    } else {
      mOdd = mOdd.multiply(new Q(mN, mN + 1));
      return mOdd.den();
    }
  }
}

