package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010326 Continued fraction for cube root of 98.
 * @author Sean A. Irvine
 */
public class A010326 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010326() {
    super(0, new A010668());
  }
}
