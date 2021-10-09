package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010245 Continued fraction for cube root of 15.
 * @author Sean A. Irvine
 */
public class A010245 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010245() {
    super(new A010587());
  }
}
