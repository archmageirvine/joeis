package irvine.oeis.a053;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a039.A039957;

/**
 * A053372 Write fundamental unit for real quadratic field of discriminant n as x + y*omega; sequence gives values of x for n == 3 mod 4.
 * @author Sean A. Irvine
 */
public class A053372 extends A039957 {

  @Override
  public Z next() {
    return QuadraticFieldUtils.fundamentalUnitPair(super.next())[0].divide2();
  }
}
