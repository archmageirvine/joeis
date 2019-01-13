package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010261.
 * @author Sean A. Irvine
 */
public class A010261 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010261() {
    super(new A010603());
  }
}
