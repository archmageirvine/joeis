package irvine.oeis.a053;

import irvine.math.group.BinaryLinearMatrixCounts;
import irvine.oeis.LambdaSequence;

/**
 * A053071 Number of invertible binary matrices A such that A^5 + I is invertible.
 * @author Gregory Morse
 */
public class A053071 extends LambdaSequence {

  /** Construct the sequence. */
  public A053071() {
    super(1, n -> BinaryLinearMatrixCounts.count(n.intValue(), BinaryLinearMatrixCounts.Type.AVOID_FIFTH));
  }
}
