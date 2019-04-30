package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016516 Continued fraction for <code>log(88)</code>.
 * @author Sean A. Irvine
 */
public class A016516 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016516() {
    super(new A016711());
  }
}
