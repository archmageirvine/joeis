package irvine.oeis.a013;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A013690 Continued fraction for zeta(14).
 * @author Sean A. Irvine
 */
public class A013690 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013690() {
    super(new A013672());
  }
}
