package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010310 Continued fraction for cube root of 82.
 * @author Sean A. Irvine
 */
public class A010310 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010310() {
    super(0, new A010652());
  }
}
