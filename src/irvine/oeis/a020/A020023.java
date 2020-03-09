package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020023 Nearest integer to <code>GAMMA(n+2/9)/GAMMA(2/9)</code>.
 * @author Sean A. Irvine
 */
public class A020023 implements Sequence {

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
