package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010273 Continued fraction for cube root of 44.
 * @author Sean A. Irvine
 */
public class A010273 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010273() {
    super(new A010615());
  }
}
