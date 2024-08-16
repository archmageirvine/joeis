package irvine.oeis.a013;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A013694 Continued fraction for zeta(18).
 * @author Sean A. Irvine
 */
public class A013694 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013694() {
    super(new A013676());
    setOffset(0);
  }
}
