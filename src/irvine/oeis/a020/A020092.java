package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020092 Ceiling of GAMMA(n+7/12)/GAMMA(7/12).
 * @author Sean A. Irvine
 */
public class A020092 implements Sequence {

  private static final Q C = new Q(7, 12);
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
