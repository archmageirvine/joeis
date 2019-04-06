package irvine.oeis.a133;

import irvine.oeis.FiniteSequence;

/**
 * A133484 A way of splitting the numbers from 1 to 16 into two groups so that the numbers in each group have the same sum, the same sum of squares and the same sum of cubes.
 * @author Georg Fischer
 */
public class A133484 extends FiniteSequence {

  /** Construct the sequence. */
  public A133484() {
    super(2, 3, 5, 8, 9, 12, 14, 15);
  }
}
