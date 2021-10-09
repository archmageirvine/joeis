package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016551 Continued fraction for log(47/2).
 * @author Sean A. Irvine
 */
public class A016551 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016551() {
    super(new A016600());
  }
}
