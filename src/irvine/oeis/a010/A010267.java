package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010267 Continued fraction for cube root of 38.
 * @author Sean A. Irvine
 */
public class A010267 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010267() {
    super(new A010609());
  }
}
