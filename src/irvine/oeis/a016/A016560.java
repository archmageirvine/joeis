package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016560 Continued fraction for <code>log(65/2)</code>.
 * @author Sean A. Irvine
 */
public class A016560 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016560() {
    super(new A016609());
  }
}
