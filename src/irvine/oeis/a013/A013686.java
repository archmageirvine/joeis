package irvine.oeis.a013;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A013686 Continued fraction for <code>zeta(10)</code>.
 * @author Sean A. Irvine
 */
public class A013686 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013686() {
    super(new A013668());
  }
}
