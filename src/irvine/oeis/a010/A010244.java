package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010244 Continued fraction for cube root of 14.
 * @author Sean A. Irvine
 */
public class A010244 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010244() {
    super(0, new A010586());
  }
}
