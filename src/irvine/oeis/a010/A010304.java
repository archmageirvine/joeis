package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010304 Continued fraction for cube root of 76.
 * @author Sean A. Irvine
 */
public class A010304 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010304() {
    super(new A010646());
  }
}
