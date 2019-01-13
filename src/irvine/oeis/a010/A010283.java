package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010283.
 * @author Sean A. Irvine
 */
public class A010283 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010283() {
    super(new A010625());
  }
}
