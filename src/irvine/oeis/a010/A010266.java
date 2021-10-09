package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010266 Continued fraction for cube root of 37.
 * @author Sean A. Irvine
 */
public class A010266 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010266() {
    super(new A010608());
  }
}
