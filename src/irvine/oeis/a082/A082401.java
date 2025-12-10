package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a005.A005374;
import irvine.oeis.a263.A263719;

/**
 * A082401 a(n) = A005374(n) - floor(r*n) where r is the positive root of x^3+x-1=0.
 * @author Sean A. Irvine
 */
public class A082401 extends A005374 {

  private static final CR R = new A263719().getCR();
  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(R.multiply(++mN).floor());
  }
}
