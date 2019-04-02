package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010289 Continued fraction for cube root of 60.
 * @author Sean A. Irvine
 */
public class A010289 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010289() {
    super(new A010631());
  }
}
