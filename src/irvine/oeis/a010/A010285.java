package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010285 Continued fraction for cube root of 56.
 * @author Sean A. Irvine
 */
public class A010285 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010285() {
    super(new A010627());
  }
}
