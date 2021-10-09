package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016541 Continued fraction for log(27/2).
 * @author Sean A. Irvine
 */
public class A016541 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016541() {
    super(new A016590());
  }
}
