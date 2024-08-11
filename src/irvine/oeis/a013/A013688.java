package irvine.oeis.a013;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A013688 Continued fraction for zeta(12).
 * @author Sean A. Irvine
 */
public class A013688 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013688() {
    super(0, new A013670());
  }
}
