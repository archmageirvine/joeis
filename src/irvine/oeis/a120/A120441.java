package irvine.oeis.a120;

import irvine.oeis.FiniteSequence;

/**
 * A120441 "Mary had a little lamb" played on a touch-tone telephone. Numbers represent the buttons to press.
 * @author Georg Fischer
 */
public class A120441 extends FiniteSequence {

  /** Construct the sequence. */
  public A120441() {
    super(1, FINITE, 3, 2, 1, 2, 3, 3, 3, 2, 2, 2, 3, 9, 9, 3, 2, 1, 2, 3, 3, 3, 3, 2, 2, 3, 2, 1);
  }
}
