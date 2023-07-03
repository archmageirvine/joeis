package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010312 Continued fraction for cube root of 84.
 * @author Sean A. Irvine
 */
public class A010312 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010312() {
    super(0, new A010654());
  }
}
