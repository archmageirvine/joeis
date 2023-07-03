package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010300 Continued fraction for cube root of 72.
 * @author Sean A. Irvine
 */
public class A010300 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010300() {
    super(0, new A010642());
  }
}
