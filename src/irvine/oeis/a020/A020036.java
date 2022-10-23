package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020036 Nearest integer to Gamma(n + 1/6)/Gamma(1/6).
 * @author Sean A. Irvine
 */
public class A020036 extends Sequence0 {

  private static final Q C = new Q(1, 6);
  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(C.add(mN));
    }
    return mA.round();
  }
}
