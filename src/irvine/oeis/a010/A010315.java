package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010315 Continued fraction for cube root of 87.
 * @author Sean A. Irvine
 */
public class A010315 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010315() {
    super(new A010657());
  }
}
