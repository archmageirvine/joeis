package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010272 Continued fraction for cube root of 43.
 * @author Sean A. Irvine
 */
public class A010272 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010272() {
    super(0, new A010614());
  }
}
