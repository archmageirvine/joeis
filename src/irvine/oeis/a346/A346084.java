package irvine.oeis.a346;

import irvine.math.group.BinaryLinearMatrixCounts;
import irvine.oeis.LambdaSequence;

/**
 * A346084 Number of invertible n X n cyclic matrices over GF(2).
 * @author Gregory Morse
 */
public class A346084 extends LambdaSequence {

  /** Construct the sequence. */
  public A346084() {
    super(0, n -> BinaryLinearMatrixCounts.count(n.intValue(), BinaryLinearMatrixCounts.Type.CYCLIC));
  }
}
