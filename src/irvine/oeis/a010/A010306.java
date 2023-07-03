package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010306 Continued fraction for cube root of 78.
 * @author Sean A. Irvine
 */
public class A010306 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010306() {
    super(0, new A010648());
  }
}
