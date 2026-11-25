package irvine.oeis.a346;

import irvine.math.group.BinaryLinearMatrixCounts;
import irvine.oeis.LambdaSequence;

/**
 * A346165 Number of invertible binary matrices with squarefree characteristic polynomial.
 * @author Gregory Morse
 */
public class A346165 extends LambdaSequence {

  /** Construct the sequence. */
  public A346165() {
    super(0, n -> BinaryLinearMatrixCounts.count(n.intValue(), BinaryLinearMatrixCounts.Type.SQUAREFREE));
  }
}
