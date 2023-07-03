package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010279 Continued fraction for cube root of 50.
 * @author Sean A. Irvine
 */
public class A010279 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010279() {
    super(0, new A010621());
  }
}
