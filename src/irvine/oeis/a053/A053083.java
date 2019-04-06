package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;

/**
 * A053083 Number of ways of getting 5 of a kind, royal flush, other straight flush, 4 of a kind, full house, other flush, other straight, 3 of a kind, 2 pair, a pair or no pair in 5-card poker with two jokers wild.
 * @author Georg Fischer
 */
public class A053083 extends FiniteSequence {

  /** Construct the sequence. */
  public A053083() {
    super(78, 84, 540, 9360, 9360, 11388, 34704, 232968, 123552, 1437936, 1302540);
  }
}
