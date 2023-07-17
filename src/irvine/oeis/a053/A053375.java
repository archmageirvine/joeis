package irvine.oeis.a053;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a039.A039957;

/**
 * A053375 Write fundamental unit for real quadratic field of discriminant n as x + y*omega; sequence gives values of y for n == 3 mod 4.
 * @author Sean A. Irvine
 */
public class A053375 extends A039957 {

  /** Construct the sequence. */
  public A053375() {
    super(0);
  }

  @Override
  public Z next() {
    return QuadraticFieldUtils.fundamentalUnitPair(super.next())[1].divide2();
  }
}
