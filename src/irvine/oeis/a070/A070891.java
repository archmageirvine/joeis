package irvine.oeis.a070;

import irvine.math.z.Z;

/**
 * A070891 Denominator of Sum_{k=1..n} mu(k)/k when it changes sign.
 * @author Sean A. Irvine
 */
public class A070891 extends A070888 {

  private long mSign = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.signum() != mSign) {
        mSign = -mSign;
        return mSum.den();
      }
    }
  }
}
