package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;

/**
 * A053080 Number of ways of getting 5 of a kind, royal flush, other straight flush, 4 of a kind, full house, other flush, other straight, 3 of a kind, 2 pair, a pair or no pair in 5-card poker when joker is wild.
 * @author Georg Fischer
 */
public class A053080 extends FiniteSequence {

  /** Construct the sequence. */
  public A053080() {
    super(1, FINITE, 13, 24, 180, 3120, 6552, 7804, 20532, 137280, 123552, 1268088, 1302540);
  }
}
