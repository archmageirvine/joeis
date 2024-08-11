package irvine.oeis.a013;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A013679 Continued fraction for zeta(2) = Pi^2/6.
 * @author Sean A. Irvine
 */
public class A013679 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013679() {
    super(0, new A013661());
  }
}
