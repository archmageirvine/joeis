package irvine.oeis.a001;

import irvine.oeis.FiniteSequence;

/**
 * A001948 These numbers when multiplied by all powers of 4 give the numbers that are not the sums of 4 distinct squares.
 * @author Sean A. Irvine
 */
public class A001948 extends FiniteSequence {

  /** Construct the sequence. */
  public A001948() {
    super(1, FINITE, 1, 2, 3, 5, 6, 7, 9, 10, 11, 13, 15, 17, 18, 19, 22, 23, 25, 27, 31, 33, 34, 37, 43, 47, 55, 58, 67, 73, 82, 97, 103);
  }
}

