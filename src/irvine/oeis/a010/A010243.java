package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010243 Continued fraction for cube root of 13.
 * @author Sean A. Irvine
 */
public class A010243 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010243() {
    super(new A010585());
  }
}
