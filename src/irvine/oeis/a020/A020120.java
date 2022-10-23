package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020120 Ceiling of GAMMA(n+5/7)/GAMMA(5/7).
 * @author Sean A. Irvine
 */
public class A020120 extends Sequence0 {

  private static final Q C = new Q(5, 7);
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
