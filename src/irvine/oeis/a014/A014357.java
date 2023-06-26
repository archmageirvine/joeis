package irvine.oeis.a014;

import irvine.oeis.FiniteSequence;

/**
 * A014357 Number of ways of getting 5 of a kind, a royal flush, other straight flush, 4 of a kind, full house, other flush, other straight, 3 of a kind, 2 pair, a pair or no pair in 5-card poker when joker is wild.
 * @author Sean A. Irvine
 */
public class A014357 extends FiniteSequence {

  /** Construct the sequence. */
  public A014357() {
    super(1, FINITE, 13, 24, 216, 3120, 6552, 7768, 20532, 137280, 123552, 1268088, 1302540);
  }
}

