package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010248 Continued fraction for cube root of 18.
 * @author Sean A. Irvine
 */
public class A010248 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010248() {
    super(new A010590());
  }
}
