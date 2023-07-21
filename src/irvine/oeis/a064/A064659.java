package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064659 a(n) = round(prime(n) - n*log(n)).
 * @author Sean A. Irvine
 */
public class A064659 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return super.next().subtract(n.multiply(n.log()).round());
  }
}
