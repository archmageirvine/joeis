package irvine.oeis.a014;

import irvine.oeis.FiniteSequence;

/**
 * A014356 Number of ways of getting no pair, a pair, 2 pair, 3 of a kind, other straight, other flush, full house, 4 of a kind, other straight flush, a royal flush, or 5 of a kind in 5-card poker when joker is wild.
 * @author Sean A. Irvine
 */
public class A014356 extends FiniteSequence {

  /** Construct the sequence. */
  public A014356() {
    super(1, FINITE, 1302, 1268088, 123552, 137280, 20532, 7768, 6552, 3120, 216, 24, 12);
  }
}

