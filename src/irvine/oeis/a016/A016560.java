package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016560 Continued fraction for log(65/2).
 * @author Sean A. Irvine
 */
public class A016560 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016560() {
    super(new A016609());
  }
}
