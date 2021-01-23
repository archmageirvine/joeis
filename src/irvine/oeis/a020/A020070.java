package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020070 a(n) = floor( Gamma(n+7/8)/Gamma(7/8) ).
 * @author Sean A. Irvine
 */
public class A020070 implements Sequence {

  private static final Q C = new Q(7, 8);
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
