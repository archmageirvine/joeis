package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010287 Continued fraction for cube root of 58.
 * @author Sean A. Irvine
 */
public class A010287 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010287() {
    super(0, new A010629());
  }
}
