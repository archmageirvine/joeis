package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016447 Continued fraction for <code>log(19)</code>.
 * @author Sean A. Irvine
 */
public class A016447 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016447() {
    super(new A016642());
  }
}
