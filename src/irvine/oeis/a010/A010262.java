package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010262 Continued fraction for cube root of 33.
 * @author Sean A. Irvine
 */
public class A010262 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010262() {
    super(0, new A010604());
  }
}
