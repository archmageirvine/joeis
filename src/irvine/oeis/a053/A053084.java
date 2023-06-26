package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;

/**
 * A053084 Number of ways of getting no pair, a pair, 2 pair, 3 of a kind, other straight, other flush, full house, 4 of a kind, other straight flush, royal flush or 5 of a kind in 5-card poker with two jokers wild.
 * @author Georg Fischer
 */
public class A053084 extends FiniteSequence {

  /** Construct the sequence. */
  public A053084() {
    super(1, FINITE, 1302540, 1437936, 123552, 232968, 34704, 11388, 9360, 9360, 540, 84, 78);
  }
}
