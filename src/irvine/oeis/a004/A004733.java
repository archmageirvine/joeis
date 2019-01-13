package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004733.
 * @author Sean A. Irvine
 */
public class A004733 implements Sequence {

  protected long mN = -1;
  private Q mEven = Q.ONE;
  private Q mOdd = Q.HALF;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      if (mN > 0) {
        mEven = mEven.multiply(mN);
      }
      mEven = mEven.divide(mN + 3);
      return mEven.den();
    } else {
      mOdd = mOdd.multiply(new Q(mN, mN + 3));
      return mOdd.den();
    }
  }
}

