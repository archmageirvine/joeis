package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004732 Numerator of n!!/(n+3)!!.
 * @author Sean A. Irvine
 */
public class A004732 implements Sequence {

  private long mN = -1;
  private Q mEven = Q.ONE;
  private Q mOdd = Q.HALF;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      if (mN > 0) {
        mEven = mEven.multiply(mN);
      }
      mEven = mEven.divide(mN + 3);
      return mEven.num();
    } else {
      mOdd = mOdd.multiply(new Q(mN, mN + 3));
      return mOdd.num();
    }
  }
}

