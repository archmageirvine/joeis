package irvine.oeis.a053;

import irvine.math.group.BinaryLinearMatrixCounts;
import irvine.oeis.LambdaSequence;

/**
 * A053060 Number of invertible binary matrices A such that A^3 + I is invertible.
 * @author Gregory Morse
 */
public class A053060 extends LambdaSequence {

  /** Construct the sequence. */
  public A053060() {
    super(1, n -> BinaryLinearMatrixCounts.count(n.intValue(), BinaryLinearMatrixCounts.Type.AVOID_CUBE));
  }
}
