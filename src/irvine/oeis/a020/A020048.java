package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020048 Integer part of <code>GAMMA(n+5/12)/GAMMA(5/12)</code>.
 * @author Sean A. Irvine
 */
public class A020048 implements Sequence {

  private static final Q C = new Q(5, 12);
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
