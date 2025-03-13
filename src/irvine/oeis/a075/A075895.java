package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075895 Rounded sum of first n odd integers squared divided by n-th prime.
 * @author Sean A. Irvine
 */
public class A075895 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    if (++mN == 1) {
      return Z.ZERO;
    }
    return new Q(Z.valueOf(mN).square().multiply(4).subtract(1).multiply(mN), p.multiply(3)).round();
  }
}
