package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016569 Continued fraction for log(83/2).
 * @author Sean A. Irvine
 */
public class A016569 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016569() {
    super(new A016618());
  }
}
