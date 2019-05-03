package irvine.oeis.a090;

import irvine.oeis.FiniteSequence;

/**
 * A090034 Number of configurations of the <code>3 X 2</code> variant of Sam Loyd's sliding block 15-puzzle that require a minimum of n moves to be reached, starting with the empty square in one of the corners.
 * @author Georg Fischer
 */
public class A090034 extends FiniteSequence {

  /** Construct the sequence. */
  public A090034() {
    super(1, 2, 3, 5, 6, 7, 10, 12, 12, 16, 23, 25, 28, 39, 44, 40, 29, 21, 18, 12, 6, 1);
  }
}
