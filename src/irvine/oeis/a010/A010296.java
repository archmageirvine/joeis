package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010296 Continued fraction for cube root of 68.
 * @author Sean A. Irvine
 */
public class A010296 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010296() {
    super(new A010638());
  }
}
