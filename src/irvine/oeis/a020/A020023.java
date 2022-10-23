package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020023 Nearest integer to Gamma(n + 2/9)/Gamma(2/9).
 * @author Sean A. Irvine
 */
public class A020023 extends Sequence0 {

  private static final Q C = new Q(2, 9);
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
