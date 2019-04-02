package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010288 Continued fraction for cube root of 59.
 * @author Sean A. Irvine
 */
public class A010288 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010288() {
    super(new A010630());
  }
}
