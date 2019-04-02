package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010294 Continued fraction for cube root of 66.
 * @author Sean A. Irvine
 */
public class A010294 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010294() {
    super(new A010636());
  }
}
