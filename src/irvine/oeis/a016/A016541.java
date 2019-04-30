package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016541 Continued fraction for <code>log(27/2)</code>.
 * @author Sean A. Irvine
 */
public class A016541 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016541() {
    super(new A016590());
  }
}
