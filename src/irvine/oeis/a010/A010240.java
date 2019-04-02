package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010240 Continued fraction for cube root of 10.
 * @author Sean A. Irvine
 */
public class A010240 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010240() {
    super(new A010582());
  }
}
