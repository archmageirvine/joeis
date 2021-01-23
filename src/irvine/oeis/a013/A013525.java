package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A013525 E.g.f.: x + (gdinv x - sinh x)/2, where gdinv = inverse-Gudermannian. Sequence has odd-indexed coefficients; others are zero.
 * @author Sean A. Irvine
 */
public class A013525 extends A000364 {

  @Override
  public Z next() {
    return super.next().subtract(mN == 0 ? -1 : 1).divide2();
  }
}
