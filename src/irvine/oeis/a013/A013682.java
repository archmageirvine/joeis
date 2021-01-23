package irvine.oeis.a013;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A013682 Continued fraction for zeta(6).
 * @author Sean A. Irvine
 */
public class A013682 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013682() {
    super(new A013664());
  }
}
