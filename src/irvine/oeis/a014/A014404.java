package irvine.oeis.a014;

import irvine.oeis.FiniteSequence;

/**
 * A014404 Number of ways of getting 5 of a kind, straight flush, 4 of a kind, full house, other flush, other straight, 3 of a kind, 2 pair, a pair or no pair in 5-card poker when joker is wild.
 * @author Sean A. Irvine
 */
public class A014404 extends FiniteSequence {

  /** Construct the sequence. */
  public A014404() {
    super(1, FINITE, 13, 204, 3120, 6552, 7804, 20532, 137280, 123552, 1268088, 1302540);
  }
}

