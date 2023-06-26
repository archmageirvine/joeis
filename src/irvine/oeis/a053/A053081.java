package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;

/**
 * A053081 Number of ways of getting no pair, a pair, 2 pair, 3 of a kind, other straight, other flush, full house, 4 of a kind, straight flush or 5 of a kind in 5-card poker when joker is wild.
 * @author Georg Fischer
 */
public class A053081 extends FiniteSequence {

  /** Construct the sequence. */
  public A053081() {
    super(1, FINITE, 1302540, 1268088, 123552, 137280, 20532, 7804, 6552, 3120, 204, 13);
  }
}
