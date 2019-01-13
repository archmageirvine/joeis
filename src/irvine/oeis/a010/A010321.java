package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010321.
 * @author Sean A. Irvine
 */
public class A010321 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010321() {
    super(new A010663());
  }
}
