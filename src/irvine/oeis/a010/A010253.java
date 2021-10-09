package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010253 Continued fraction for cube root of 23.
 * @author Sean A. Irvine
 */
public class A010253 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010253() {
    super(new A010595());
  }
}
