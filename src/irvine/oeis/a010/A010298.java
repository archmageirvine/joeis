package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010298 Continued fraction for cube root of 70.
 * @author Sean A. Irvine
 */
public class A010298 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010298() {
    super(new A010640());
  }
}
