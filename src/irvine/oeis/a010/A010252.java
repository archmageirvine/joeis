package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010252 Continued fraction for cube root of 22.
 * @author Sean A. Irvine
 */
public class A010252 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010252() {
    super(new A010594());
  }
}
