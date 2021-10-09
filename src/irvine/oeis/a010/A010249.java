package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010249 Continued fraction for cube root of 19.
 * @author Sean A. Irvine
 */
public class A010249 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010249() {
    super(new A010591());
  }
}
