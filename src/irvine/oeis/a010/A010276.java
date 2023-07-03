package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010276 Continued fraction for cube root of 47.
 * @author Sean A. Irvine
 */
public class A010276 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010276() {
    super(0, new A010618());
  }
}
