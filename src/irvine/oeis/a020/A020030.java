package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020030 Nearest integer to <code>GAMMA(n+5/7)/GAMMA(5/7)</code>.
 * @author Sean A. Irvine
 */
public class A020030 implements Sequence {

  private static final Q C = new Q(5, 7);
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
