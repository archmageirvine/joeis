package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010284 Continued fraction for cube root of 55.
 * @author Sean A. Irvine
 */
public class A010284 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010284() {
    super(new A010626());
  }
}
