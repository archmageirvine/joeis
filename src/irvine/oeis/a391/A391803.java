package irvine.oeis.a391;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A391803 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A391803 extends A000040 {

  private long mN = 0;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, super.next()));
    return mSum.multiply(++mN).floor();
  }
}
