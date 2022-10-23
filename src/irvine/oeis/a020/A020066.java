package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020066 Integer part of Gamma(n+5/9)/Gamma(5/9).
 * @author Sean A. Irvine
 */
public class A020066 extends Sequence0 {

  private static final Q C = new Q(5, 9);
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
