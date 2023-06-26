package irvine.oeis.a294;

import irvine.oeis.FiniteSequence;

/**
 * A294524 Numbers that have a unique partition into a sum of five nonnegative squares.
 * @author Georg Fischer
 */
public class A294524 extends FiniteSequence {

  /** Construct the sequence. */
  public A294524() {
    super(1, FINITE, 0, 1, 2, 3, 6, 7, 15);
  }
}
