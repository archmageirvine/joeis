package irvine.oeis.a052;

import irvine.oeis.FiniteSequence;

/**
 * A052370 Number of 6 X 6 binary matrices with <code>n=0</code>...36 ones up to row and column permutations.
 * @author Georg Fischer
 */
public class A052370 extends FiniteSequence {

  /** Construct the sequence. */
  public A052370() {
    super(1, 1, 3, 6, 16, 34, 90, 182, 425, 870, 1799, 3323, 5973, 9595, 14570, 19865, 25191, 28706, 30310, 28706, 25191, 19865, 14570, 9595, 5973, 3323, 1799, 870, 425, 182, 90, 34, 16, 6, 3, 1, 1);
  }
}
