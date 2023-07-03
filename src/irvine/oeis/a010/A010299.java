package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010299 Continued fraction for cube root of 71.
 * @author Sean A. Irvine
 */
public class A010299 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010299() {
    super(0, new A010641());
  }
}
