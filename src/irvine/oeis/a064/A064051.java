package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064051 a(n) = 2*prime(n)^2 - prime(n+1)^2.
 * @author Sean A. Irvine
 */
public class A064051 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    final Z q = mP;
    mP = super.next();
    return q.square().multiply2().subtract(mP.square());
  }
}
