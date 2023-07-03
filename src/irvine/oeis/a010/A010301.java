package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010301 Continued fraction for cube root of 73.
 * @author Sean A. Irvine
 */
public class A010301 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010301() {
    super(0, new A010643());
  }
}
