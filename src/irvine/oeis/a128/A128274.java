package irvine.oeis.a128;
// manually 2026-10-27/polyz at 2026-10-27 

import irvine.math.z.Z;
import irvine.oeis.PolynomialFieldSequence;

/**
 * A128274 Absolute values of numerators of series expansion of cosh(x)/sqrt((cosh(x))^2+(sinh(x))^2) about 0 (even-indexed coefficients only).
 * @author Georg Fischer
 */
public class A128274 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A128274() {
    super(0, "[1]", "x,cosh,x,cosh,^2,x,sinh,^2,+,sqrt,/", 0, 0, 0, 2);
  }

  @Override
  public Z next() {
    return super.next().abs();
  }

}
