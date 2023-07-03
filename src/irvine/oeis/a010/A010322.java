package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010322 Continued fraction for cube root of 94.
 * @author Sean A. Irvine
 */
public class A010322 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010322() {
    super(0, new A010664());
  }
}
