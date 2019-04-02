package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010292 Continued fraction for cube root of 63.
 * @author Sean A. Irvine
 */
public class A010292 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010292() {
    super(new A010634());
  }
}
