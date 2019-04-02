package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010247 Continued fraction for cube root of 17.
 * @author Sean A. Irvine
 */
public class A010247 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010247() {
    super(new A010589());
  }
}
