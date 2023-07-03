package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010246 Continued fraction for cube root of 16.
 * @author Sean A. Irvine
 */
public class A010246 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010246() {
    super(0, new A010588());
  }
}
