package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010256 Continued fraction for cube root of 26.
 * @author Sean A. Irvine
 */
public class A010256 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010256() {
    super(0, new A010598());
  }
}
