package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075457.
 * @author Sean A. Irvine
 */
public class A075465 extends A000040 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.add(super.next());
    return new Q(mSum, ++mN).add(Q.HALF).ceiling().subtract(1);
  }
}
