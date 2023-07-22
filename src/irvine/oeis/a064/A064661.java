package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064661 a(n) = n - floor( prime(n)/log(prime(n)) ).
 * @author Sean A. Irvine
 */
public class A064661 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR p = CR.valueOf(super.next());
    return Z.valueOf(++mN).subtract(p.divide(p.log()).floor());
  }
}
