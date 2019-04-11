package irvine.oeis.a109;

import irvine.oeis.FiniteSequence;

/**
 * A109721 Number of different ways of selecting n nonempty cells in <code>a 4</code> X 4 binary matrix, excluding all rotationally and symmetrically equivalent matrices.
 * @author Georg Fischer
 */
public class A109721 extends FiniteSequence {

  /** Construct the sequence. */
  public A109721() {
    super(1, 3, 21, 77, 252, 567, 1051, 1465, 1674, 1465, 1051, 567, 252, 77, 21, 3, 1);
  }
}
