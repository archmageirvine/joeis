package irvine.oeis.a224;

import irvine.math.group.BinaryLinearMatrixCounts;
import irvine.oeis.LambdaSequence;

/**
 * A224879 Number of invertible binary matrices up to row and column permutations.
 * @author Gregory Morse
 */
public class A224879 extends LambdaSequence {

  /** Construct the sequence. */
  public A224879() {
    super(1, n -> BinaryLinearMatrixCounts.permutationOrbits(n.intValue(), true));
  }
}
