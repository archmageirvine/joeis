package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016573 Continued fraction for log(91/2).
 * @author Sean A. Irvine
 */
public class A016573 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016573() {
    super(new A016622());
  }
}
