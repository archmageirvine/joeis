package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020088 Integer part of <code>Gamma(n + 2/3)/Gamma(2/3)</code>.
 * @author Sean A. Irvine
 */
public class A020088 implements Sequence {

  private static final Q C = new Q(2, 3);
  private int mN = -2;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(C.add(mN));
    }
    return mA.floor();
  }
}
