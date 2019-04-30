package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020114 Ceiling of <code>GAMMA(n+1/9)/GAMMA(1/9)</code>.
 * @author Sean A. Irvine
 */
public class A020114 implements Sequence {

  private static final Q C = new Q(1, 9);
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
