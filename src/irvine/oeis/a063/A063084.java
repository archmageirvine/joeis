package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A063084 a(n) = pi(n-1)*n - pi(n)*(n-1), where pi() = A000720().
 * @author Sean A. Irvine
 */
public class A063084 extends A000720 {

  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.multiply(++mN).subtract(mA.multiply(mN - 1));
  }
}
