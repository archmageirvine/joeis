package irvine.oeis.a193;

import irvine.oeis.FiniteSequence;

/**
 * A193622 Integers originally used as card values in Planning Poker.
 * @author Georg Fischer
 */
public class A193622 extends FiniteSequence {

  /** Construct the sequence. */
  public A193622() {
    super(1, FINITE, 1, 2, 3, 5, 7, 10);
  }
}
