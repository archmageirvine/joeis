package irvine.oeis.a053;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a039.A039956;

/**
 * A053371 Write fundamental unit for real quadratic field of discriminant n as x + y*omega; sequence gives values of x for n == 2 mod 4.
 * @author Sean A. Irvine
 */
public class A053371 extends A039956 {

  /** Construct the sequence. */
  public A053371() {
    super(0);
  }

  @Override
  public Z next() {
    return QuadraticFieldUtils.fundamentalUnitPair(super.next())[0].divide2();
  }
}
