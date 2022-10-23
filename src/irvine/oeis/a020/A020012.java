package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020012 Nearest integer to Gamma(n + 3/11)/Gamma(3/11).
 * @author Sean A. Irvine
 */
public class A020012 extends Sequence0 {

  private static final Q C = new Q(3, 11);
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
