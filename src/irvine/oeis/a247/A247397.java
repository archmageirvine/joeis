package irvine.oeis.a247;

import irvine.oeis.FiniteSequence;

/**
 * A247397 Numbers n such that when n unit-diameter circles are arranged non-overlapping in the plane, and those circles are then enclosed in a rectangle, the area of the rectangle must be at least n.
 * @author Georg Fischer
 */
public class A247397 extends FiniteSequence {

  /** Construct the sequence. */
  public A247397() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13);
  }
}
