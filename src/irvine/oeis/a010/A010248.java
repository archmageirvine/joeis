package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010248 Continued fraction for cube root of 18.
 * @author Sean A. Irvine
 */
public class A010248 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010248() {
    super(0, new A010590());
  }
}
