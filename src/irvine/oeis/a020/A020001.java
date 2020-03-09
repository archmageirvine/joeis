package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020001 Nearest integer to <code>Gamma(n + 11/12)/Gamma(11/12)</code>.
 * @author Sean A. Irvine
 */
public class A020001 implements Sequence {

  private static final Q C = new Q(11, 12);
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
