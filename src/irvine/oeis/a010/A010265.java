package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010265 Continued fraction for cube root of 36.
 * @author Sean A. Irvine
 */
public class A010265 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010265() {
    super(0, new A010607());
  }
}
