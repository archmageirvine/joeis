package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A063709 Remainder when n^n is divided by n!.
 * @author Sean A. Irvine
 */
public class A063709 extends A000142 {

  @Override
  public Z next() {
    final Z f = super.next();
    final Z n = Z.valueOf(mN);
    return n.modPow(n, f);
  }
}
