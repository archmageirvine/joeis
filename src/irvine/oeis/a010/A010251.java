package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010251 Continued fraction for cube root of 21.
 * @author Sean A. Irvine
 */
public class A010251 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010251() {
    super(0, new A010593());
  }
}
