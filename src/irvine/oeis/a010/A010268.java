package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010268 Continued fraction for cube root of 39.
 * @author Sean A. Irvine
 */
public class A010268 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010268() {
    super(new A010610());
  }
}
