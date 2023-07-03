package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010291 Continued fraction for cube root of 62.
 * @author Sean A. Irvine
 */
public class A010291 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010291() {
    super(0, new A010633());
  }
}
