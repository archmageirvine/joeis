package irvine.oeis.a023;

import irvine.oeis.FiniteSequence;

/**
 * A023651 (product of digits of n) * (sum of digits of n) = 2n.
 * @author Sean A. Irvine
 */
public class A023651 extends FiniteSequence {

  /** Construct the sequence. */
  public A023651() {
    super(0, 2, 15, 24, 1575, 39366);
  }
}
