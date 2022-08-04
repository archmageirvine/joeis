package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006882;

/**
 * A058314 Sum of terms in simple continued fraction for n!!/(n-1)!!, where n!! is a double factorial, n(n-2)(n-4)....
 * @author Sean A. Irvine
 */
public class A058314 extends A006882 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return A058027.continuedFractionSum(new Q(mA, t));
  }
}
