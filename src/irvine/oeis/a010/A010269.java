package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010269 Continued fraction for cube root of 40.
 * @author Sean A. Irvine
 */
public class A010269 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010269() {
    super(0, new A010611());
  }
}
