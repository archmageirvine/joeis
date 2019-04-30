package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020115 Ceiling of <code>GAMMA(n+7/8)/GAMMA(7/8)</code>.
 * @author Sean A. Irvine
 */
public class A020115 implements Sequence {

  private static final Q C = new Q(7, 8);
  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(C.add(mN));
    }
    return mA.ceiling();
  }
}
