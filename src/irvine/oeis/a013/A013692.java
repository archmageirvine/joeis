package irvine.oeis.a013;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A013692 Continued fraction for zeta(16).
 * @author Sean A. Irvine
 */
public class A013692 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013692() {
    super(0, new A013674());
  }
}
