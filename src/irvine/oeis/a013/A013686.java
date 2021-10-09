package irvine.oeis.a013;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A013686 Continued fraction for zeta(10).
 * @author Sean A. Irvine
 */
public class A013686 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013686() {
    super(new A013668());
  }
}
