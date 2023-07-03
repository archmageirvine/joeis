package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010327 Continued fraction for cube root of 99.
 * @author Sean A. Irvine
 */
public class A010327 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010327() {
    super(0, new A010669());
  }
}
