package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010314 Continued fraction for cube root of 86.
 * @author Sean A. Irvine
 */
public class A010314 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010314() {
    super(new A010656());
  }
}
