package irvine.oeis.a014;

import irvine.oeis.FiniteSequence;

/**
 * A014358 Chance of getting no pair, a pair, 2 pair, 3 of a kind, other straight, other flush, full house, 4 of a kind, other straight flush, a royal flush, or 5 of a kind in poker when joker is wild is 1 in <code>a(n) (rounded</code> to nearest <code>integer)</code>.
 * @author Sean A. Irvine
 */
public class A014358 extends FiniteSequence {

  /** Construct the sequence. */
  public A014358() {
    super(2, 2, 23, 21, 140, 369, 438, 920, 13285, 119570, 220745);
  }
}

