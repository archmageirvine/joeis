package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010311 Continued fraction for cube root of 83.
 * @author Sean A. Irvine
 */
public class A010311 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010311() {
    super(0, new A010653());
  }
}
