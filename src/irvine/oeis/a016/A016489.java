package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016489 Continued fraction for <code>log(61)</code>.
 * @author Sean A. Irvine
 */
public class A016489 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016489() {
    super(new A016684());
  }
}
