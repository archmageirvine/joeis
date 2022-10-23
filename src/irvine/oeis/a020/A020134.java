package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020134 Ceiling of Gamma(n + 1/3)/Gamma(1/3).
 * @author Sean A. Irvine
 */
public class A020134 extends Sequence0 {

  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(Q.ONE_THIRD.add(mN));
    }
    return mA.ceiling();
  }
}
