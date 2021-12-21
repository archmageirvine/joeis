package irvine.oeis.a053;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a039.A039955;

/**
 * A053373 Write fundamental unit for real quadratic field of discriminant n as x + y*omega; sequence gives values of y for n == 1 (mod 4).
 * @author Sean A. Irvine
 */
public class A053373 extends A039955 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return QuadraticFieldUtils.fundamentalUnitPair(super.next())[1];
  }
}
