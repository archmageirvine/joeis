package irvine.oeis.a053;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a039.A039956;

/**
 * A053374 Write fundamental unit for real quadratic field of discriminant n as x + y*omega; sequence gives values of y for n == 2 mod 4.
 * @author Sean A. Irvine
 */
public class A053374 extends A039956 {

  @Override
  public Z next() {
    return QuadraticFieldUtils.fundamentalUnitPair(super.next())[1].divide2();
  }
}
