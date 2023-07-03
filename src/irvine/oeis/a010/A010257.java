package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010257 Continued fraction for cube root of 28.
 * @author Sean A. Irvine
 */
public class A010257 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010257() {
    super(0, new A010599());
  }
}
