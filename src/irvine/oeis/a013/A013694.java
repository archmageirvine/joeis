package irvine.oeis.a013;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A013694 Continued fraction for <code>zeta(18)</code>.
 * @author Sean A. Irvine
 */
public class A013694 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013694() {
    super(new A013676());
  }
}
