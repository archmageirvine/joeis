package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020074 a(n) = floor( Gamma(n+6/7)/Gamma(6/7) ).
 * @author Sean A. Irvine
 */
public class A020074 extends Sequence0 {

  private static final Q C = new Q(6, 7);
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
