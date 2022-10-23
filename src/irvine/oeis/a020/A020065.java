package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020065 Integer part of Gamma(n+7/9)/Gamma(7/9).
 * @author Sean A. Irvine
 */
public class A020065 extends Sequence0 {

  private static final Q C = new Q(7, 9);
  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(C.add(mN));
    }
    return mA.floor();
  }
}
