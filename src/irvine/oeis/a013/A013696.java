package irvine.oeis.a013;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A013696 Continued fraction for <code>zeta(20)</code>.
 * @author Sean A. Irvine
 */
public class A013696 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013696() {
    super(new A013678());
  }
}
