package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065924 Numbers n such that 1/n starts with n, after excluding leading zeros.
 * @author Sean A. Irvine
 */
public class A065924 extends Sequence1 {

  private static final CR SQRT10 = CR.TEN.sqrt();
  private Z mT = null;
  private boolean mSqrt = false;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
      return Z.ONE;
    }
    while (true) {
      mSqrt = !mSqrt;
      if (mSqrt) {
        final Z t = SQRT10.multiply(mT).floor();
        Q a = new Q(Z.ONE, t);
        final Q b = new Q(t);
        while (a.compareTo(b) < 0) {
          a = a.multiply(10);
        }
        if (a.toZ().equals(t)) {
          return t;
        }
      } else {
        mT = mT.multiply(10);
        return mT;
      }
    }
  }
}
