package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010309 Continued fraction for cube root of 81.
 * @author Sean A. Irvine
 */
public class A010309 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010309() {
    super(0, new A010651());
  }
}
