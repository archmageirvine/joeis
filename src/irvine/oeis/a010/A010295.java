package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010295 Continued fraction for cube root of 67.
 * @author Sean A. Irvine
 */
public class A010295 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010295() {
    super(new A010637());
  }
}
