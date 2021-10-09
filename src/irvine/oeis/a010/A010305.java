package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010305 Continued fraction for cube root of 77.
 * @author Sean A. Irvine
 */
public class A010305 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010305() {
    super(new A010647());
  }
}
