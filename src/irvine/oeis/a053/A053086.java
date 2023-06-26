package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;

/**
 * A053086 Number of ways of getting no pair, a pair, 2 pair, 3 of a kind, other straight, other flush, full house, 4 of a kind, other straight flush, royal flush or 5 of a kind in 5-card poker with deuces wild.
 * @author Georg Fischer
 */
public class A053086 extends FiniteSequence {

  /** Construct the sequence. */
  public A053086() {
    super(1, FINITE, 799680, 1225008, 95040, 355080, 62232, 14472, 12672, 31552, 2068, 484, 672);
  }
}
