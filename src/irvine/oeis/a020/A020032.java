package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020032 Nearest integer to GAMMA(n+3/7)/GAMMA(3/7).
 * @author Sean A. Irvine
 */
public class A020032 implements Sequence {

  private static final Q C = new Q(3, 7);
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
