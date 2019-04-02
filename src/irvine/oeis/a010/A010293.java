package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010293 Continued fraction for cube root of 65.
 * @author Sean A. Irvine
 */
public class A010293 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010293() {
    super(new A010635());
  }
}
