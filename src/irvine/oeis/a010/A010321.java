package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010321 Continued fraction for cube root of 93.
 * @author Sean A. Irvine
 */
public class A010321 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010321() {
    super(0, new A010663());
  }
}
