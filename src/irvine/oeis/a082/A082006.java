package irvine.oeis.a082;

import irvine.oeis.FiniteSequence;

/**
 * A082006 In the following square array numbers (not occurring earlier) are entered like this: <code>a(1, 1), a(1, 2), a(2, 1), a(3, 1), a(2, 2), a(1, 3), a(1, 4), a(2, 3), a(3, 2), a(4, 1), a(5, 1), a(4, 2)</code>, ... such that every entry is coprime to the members of the row and column it belongs, with the condition that the n-th diagonal sum is a multiple of n. <code>1 2 7 9 31 25... 4 5 11 23 27... 3 13 8... 19 21... 17</code> ... ... Sequence contains numbers as they are entered.
 * @author Georg Fischer
 */
public class A082006 extends FiniteSequence {

  /** Construct the sequence. */
  public A082006() {
    super(1, 2, 4, 3, 5, 7, 9, 11, 13, 19, 17, 21, 8, 23, 31, 25, 27, 29, 37, 41);
  }
}
