package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020103 Ceiling of <code>GAMMA(n+2/11)/GAMMA(2/11)</code>.
 * @author Sean A. Irvine
 */
public class A020103 implements Sequence {

  private static final Q C = new Q(2, 11);
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
