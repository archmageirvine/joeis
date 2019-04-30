package irvine.oeis.a013;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A013692 Continued fraction for <code>zeta(16)</code>.
 * @author Sean A. Irvine
 */
public class A013692 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013692() {
    super(new A013674());
  }
}
