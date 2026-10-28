package irvine.oeis.a128;
// manually 2026-10-27/polyz at 2026-10-27 

import irvine.math.z.Z;
import irvine.oeis.PolynomialFieldSequence;

/**
 * A128275 Absolute values of numerators of series expansion of sinh(x)/sqrt((cosh(x))^2+(sinh(x))^2) about 0 (odd indexed coefficients only).
 * @author Georg Fischer
 */
public class A128275 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A128275() {
    super(0, "[1]", "x,sinh,x,cosh,^2,x,sinh,^2,+,sqrt,/", 0, 0, 1, 2);
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}
