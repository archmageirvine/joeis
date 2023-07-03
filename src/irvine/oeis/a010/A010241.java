package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010241 Continued fraction for cube root of 11.
 * @author Sean A. Irvine
 */
public class A010241 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010241() {
    super(0, new A010583());
  }
}
