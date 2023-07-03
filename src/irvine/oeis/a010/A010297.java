package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010297 Continued fraction for cube root of 69.
 * @author Sean A. Irvine
 */
public class A010297 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010297() {
    super(0, new A010639());
  }
}
