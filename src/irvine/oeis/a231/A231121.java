package irvine.oeis.a231;
// manually 2025-07-12/polyz at 2025-07-12 20:45

import irvine.oeis.PolynomialFieldSequence;

/**
 * A231121 Denominators of coefficients of expansion of arctan(x)^3.
 * @author Georg Fischer
 */
public class A231121 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A231121() {
    super(0, "[1]", "x,atan,^3", 0, 4, 1, 2);
    next();
  }
}
