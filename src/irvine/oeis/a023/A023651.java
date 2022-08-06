package irvine.oeis.a023;

import irvine.oeis.FiniteSequence;

/**
 * A023651 Numbers k such that (product of digits of k) * (sum of digits of k) = 2k.
 * @author Sean A. Irvine
 */
public class A023651 extends FiniteSequence {

  /** Construct the sequence. */
  public A023651() {
    super(0, 2, 15, 24, 1575, 39366);
  }
}
