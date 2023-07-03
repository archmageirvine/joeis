package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010294 Continued fraction for cube root of 66.
 * @author Sean A. Irvine
 */
public class A010294 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010294() {
    super(0, new A010636());
  }
}
