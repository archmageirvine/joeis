package irvine.oeis.a193;

import irvine.oeis.FiniteSequence;

/**
 * A193616 Integers often used as card values in Planning Poker decks.
 * @author Georg Fischer
 */
public class A193616 extends FiniteSequence {

  /** Construct the sequence. */
  public A193616() {
    super(1, FINITE, 0, 1, 2, 3, 5, 8, 13, 20, 40, 100);
  }
}
