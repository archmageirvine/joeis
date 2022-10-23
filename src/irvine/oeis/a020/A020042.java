package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020042 a(n) = round( Gamma(n+1/4)/Gamma(1/4) ).
 * @author Sean A. Irvine
 */
public class A020042 extends Sequence0 {

  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(Q.ONE_QUARTER.add(mN));
    }
    return mA.round();
  }
}
