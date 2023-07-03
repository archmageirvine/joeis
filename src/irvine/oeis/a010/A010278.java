package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010278 Continued fraction for cube root of 49.
 * @author Sean A. Irvine
 */
public class A010278 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010278() {
    super(0, new A010620());
  }
}
