package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010303.
 * @author Sean A. Irvine
 */
public class A010303 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010303() {
    super(new A010645());
  }
}
