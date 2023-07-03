package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010270 Continued fraction for cube root of 41.
 * @author Sean A. Irvine
 */
public class A010270 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010270() {
    super(0, new A010612());
  }
}
