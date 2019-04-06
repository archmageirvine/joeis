package irvine.oeis.a307;

import irvine.oeis.FiniteSequence;

/**
 * A307177 Decimal expansion of smallest nontrivial base-10 number that contains all pairwise products of its digits as substrings.
 * @author Georg Fischer
 */
public class A307177 extends FiniteSequence {

  /** Construct the sequence. */
  public A307177() {
    super(1, 0, 1, 2, 0, 1, 4, 0, 1, 5, 2, 1, 6, 2, 4, 2, 5, 3, 0, 3, 2, 7, 2, 8, 1, 8, 3, 5, 4, 5, 6, 3, 6, 4, 8, 4, 9);
  }
}
