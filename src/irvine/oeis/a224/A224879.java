package irvine.oeis.a224;

import irvine.math.group.BinaryLinearMatrixCounts;
import irvine.oeis.LambdaSequence;

/**
 * A224879 Number of equivalence classes of n X n nonsingular matrices over GF(2), up to row and column permutation.
 * @author Gregory Morse
 */
public class A224879 extends LambdaSequence {

  /** Construct the sequence. */
  public A224879() {
    super(1, n -> BinaryLinearMatrixCounts.permutationOrbits(n.intValue(), true));
  }
}
