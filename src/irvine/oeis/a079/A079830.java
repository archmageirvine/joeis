package irvine.oeis.a079;

import irvine.oeis.FiniteSequence;

/**
 * A079830 Number of positions that are exactly n moves from the starting position in the Rubik&apos;s Cheese puzzle.
 * @author Georg Fischer
 */
public class A079830 extends FiniteSequence {

  /** Construct the sequence. */
  public A079830() {
    super(1, 3, 6, 12, 18, 24, 23, 9);
  }
}
