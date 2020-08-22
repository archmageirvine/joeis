package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016531 Continued fraction for log(7/2).
 * @author Sean A. Irvine
 */
public class A016531 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016531() {
    super(new A016580());
  }
}
