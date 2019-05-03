package irvine.oeis.a098;

import irvine.oeis.FiniteSequence;

/**
 * A098072 An example of a <code>3 X 3</code> matrix with nonnegative elements that produces the maximum possible number of 10080 different determinants if all <code>9!</code> permutations of the matrix elements are performed. The target is to find a matrix for which the largest element becomes as small as possible.
 * @author Georg Fischer
 */
public class A098072 extends FiniteSequence {

  /** Construct the sequence. */
  public A098072() {
    super(0, 1, 17, 43, 82, 87, 88, 91, 100);
  }
}
