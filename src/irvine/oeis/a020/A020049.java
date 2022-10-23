package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020049 a(n) = floor(Gamma(n+1/12)/Gamma(1/12)).
 * @author Sean A. Irvine
 */
public class A020049 extends Sequence0 {

  private static final Q C = new Q(1, 12);
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
