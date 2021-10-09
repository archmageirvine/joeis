package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010261 Continued fraction for cube root of 32.
 * @author Sean A. Irvine
 */
public class A010261 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010261() {
    super(new A010603());
  }
}
