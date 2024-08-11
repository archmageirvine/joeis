package irvine.oeis.a013;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A013696 Continued fraction for zeta(20).
 * @author Sean A. Irvine
 */
public class A013696 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013696() {
    super(0, new A013678());
  }
}
