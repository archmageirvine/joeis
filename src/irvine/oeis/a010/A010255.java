package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010255 Continued fraction for cube root of 25.
 * @author Sean A. Irvine
 */
public class A010255 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010255() {
    super(0, new A010597());
  }
}
