package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079415 a(n) = floor(prime(n)/n) * ceiling(prime(n)/n) / 2.
 * @author Sean A. Irvine
 */
public class A079415 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    return p.divide(++mN).multiply(p.add(mN - 1).divide(mN)).divide2();
  }
}

