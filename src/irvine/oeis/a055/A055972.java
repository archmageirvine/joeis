package irvine.oeis.a055;

import irvine.oeis.a100.A100609;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A055972 Continued fraction for the number 1 + 1/(e + 1/(e^2 + 1/(e^3 + 1/(e^4 +...)))).
 * @author Sean A. Irvine
 */
public class A055972 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A055972() {
    super(0, new A100609());
  }
}
