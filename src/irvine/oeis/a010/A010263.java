package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010263.
 * @author Sean A. Irvine
 */
public class A010263 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010263() {
    super(new A010605());
  }
}
