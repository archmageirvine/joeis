package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010264 Continued fraction for cube root of 35.
 * @author Sean A. Irvine
 */
public class A010264 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010264() {
    super(0, new A010606());
  }
}
