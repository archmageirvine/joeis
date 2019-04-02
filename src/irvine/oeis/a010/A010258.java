package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010258 Continued fraction for cube root of 29.
 * @author Sean A. Irvine
 */
public class A010258 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010258() {
    super(new A010600());
  }
}
