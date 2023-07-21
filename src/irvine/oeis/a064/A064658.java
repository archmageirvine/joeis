package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064658 a(n) = ceiling(prime(n) - n*log(n)).
 * @author Sean A. Irvine
 */
public class A064658 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return super.next().subtract(n.multiply(n.log()).floor());
  }
}
