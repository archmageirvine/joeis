package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010254 Continued fraction for cube root of 24.
 * @author Sean A. Irvine
 */
public class A010254 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010254() {
    super(0, new A010596());
  }
}
