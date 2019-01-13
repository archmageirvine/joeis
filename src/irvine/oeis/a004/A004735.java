package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004735.
 * @author Sean A. Irvine
 */
public class A004735 implements Sequence {

  private long mN = 0;
  private Q mEven = new Q(4);
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

