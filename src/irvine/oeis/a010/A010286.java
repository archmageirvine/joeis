package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010286 Continued fraction for cube root of 57.
 * @author Sean A. Irvine
 */
public class A010286 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010286() {
    super(0, new A010628());
  }
}
