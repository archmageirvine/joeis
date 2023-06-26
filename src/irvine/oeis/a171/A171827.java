package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171827 Nonnegative integers that can be made by using exactly four fours (4 4's) and the four basic operators {+, -, *, /}.
 * @author Georg Fischer
 */
public class A171827 extends FiniteSequence {

  /** Construct the sequence. */
  public A171827() {
    super(1, FINITE, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 16, 17, 20, 24, 28, 32, 36, 48, 60, 64, 68, 80, 128, 256);
  }
}
