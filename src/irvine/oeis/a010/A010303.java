package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010303 Continued fraction for cube root of 75.
 * @author Sean A. Irvine
 */
public class A010303 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010303() {
    super(0, new A010645());
  }
}
