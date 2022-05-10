package irvine.oeis.a319;

import irvine.oeis.triangle.RowSumSequence;

/**
 * A319518 Number of sets of nonempty words with a total of n letters over n-ary alphabet such that if a letter occurs in the set all predecessors occur at least once.
 * if a letter occurs in the set all predecessors occur at least once.
 * @author Georg Fischer
 */
public class A319518 extends RowSumSequence {

  /** Construct the sequence. */
  public A319518() {
    super(new A319501());
  }
}
