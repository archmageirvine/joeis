package irvine.oeis.a133;

import irvine.oeis.FiniteSequence;

/**
 * A133483 A way of splitting the numbers from 1 to 16 into two groups so that the numbers in each group have the same sum, the same sum of squares and the same sum of cubes.
 * @author Georg Fischer
 */
public class A133483 extends FiniteSequence {

  /** Construct the sequence. */
  public A133483() {
    super(1, FINITE, 1, 4, 6, 7, 10, 11, 13, 16);
  }
}
