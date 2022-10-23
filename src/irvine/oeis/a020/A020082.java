package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020082 a(n) = floor( Gamma(n + 4/5)/Gamma(4/5) ).
 * @author Sean A. Irvine
 */
public class A020082 extends Sequence0 {

  private static final Q C = new Q(4, 5);
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
