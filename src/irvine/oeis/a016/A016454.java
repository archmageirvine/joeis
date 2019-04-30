package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016454 Continued fraction for <code>log(26)</code>.
 * @author Sean A. Irvine
 */
public class A016454 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016454() {
    super(new A016649());
  }
}
