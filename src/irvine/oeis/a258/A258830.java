package irvine.oeis.a258;

import irvine.oeis.triangle.RowSumSequence;

/**
 * A258830 Number of permutations p of [n] such that the up-down signature of 0,p has nonnegative partial sums.
 * @author Georg Fischer
 */
public class A258830 extends RowSumSequence {

  /** Construct the sequence. */
  public A258830() {
    super(new A258829());
  }
}
