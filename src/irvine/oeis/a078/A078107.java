package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078107 Numbers k such that it is not possible to arrange the numbers from 1 to k in a chain with adjacent links summing to a square.
 * @author Georg Fischer
 */
public class A078107 extends FiniteSequence {

  /** Construct the sequence. */
  public A078107() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 18, 19, 20, 21, 22, 24);
  }
}
