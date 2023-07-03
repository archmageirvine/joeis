package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010259 Continued fraction for cube root of 30.
 * @author Sean A. Irvine
 */
public class A010259 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010259() {
    super(0, new A010601());
  }
}
