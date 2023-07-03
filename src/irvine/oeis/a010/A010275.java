package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010275 Continued fraction for cube root of 46.
 * @author Sean A. Irvine
 */
public class A010275 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010275() {
    super(0, new A010617());
  }
}
