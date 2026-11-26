package irvine.oeis.a382;

import irvine.math.group.BinaryLinearMatrixCounts;
import irvine.oeis.LambdaSequence;

/**
 * A382018 Number of orbits under the action of the permutation group S(n) on the nonsingular n X n matrices over GF(2).
 * @author Gregory Morse
 */
public class A382018 extends LambdaSequence {

  /** Construct the sequence. */
  public A382018() {
    super(0, n -> BinaryLinearMatrixCounts.permutationOrbits(n.intValue(), false));
  }
}
