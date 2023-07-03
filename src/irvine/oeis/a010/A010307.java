package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010307 Continued fraction for cube root of 79.
 * @author Sean A. Irvine
 */
public class A010307 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010307() {
    super(0, new A010649());
  }
}
