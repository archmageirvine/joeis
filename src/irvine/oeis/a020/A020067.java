package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020067 Integer part of Gamma(n+4/9)/Gamma(4/9).
 * @author Sean A. Irvine
 */
public class A020067 extends Sequence0 {

  private static final Q C = new Q(4, 9);
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
