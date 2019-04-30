package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020099 Ceiling of <code>GAMMA(n+6/11)/GAMMA(6/11)</code>.
 * @author Sean A. Irvine
 */
public class A020099 implements Sequence {

  private static final Q C = new Q(6, 11);
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
