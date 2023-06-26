package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;

/**
 * A053082 Number of ways of getting no pair, a pair, 2 pair, 3 of a kind, other straight, other flush, full house, 4 of a kind, other straight flush, royal flush or 5 of a kind in 5-card poker when joker is wild.
 * @author Georg Fischer
 */
public class A053082 extends FiniteSequence {

  /** Construct the sequence. */
  public A053082() {
    super(1, FINITE, 1302540, 1268088, 123552, 137280, 20532, 7804, 6552, 3120, 180, 24, 13);
  }
}
