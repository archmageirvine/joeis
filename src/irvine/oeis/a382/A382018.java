package irvine.oeis.a382;

import irvine.math.group.BinaryLinearMatrixCounts;
import irvine.oeis.LambdaSequence;

/**
 * A382018 Number of orbits of S(n) on nonsingular binary matrices.
 * @author Gregory Morse
 */
public class A382018 extends LambdaSequence {

  /** Construct the sequence. */
  public A382018() {
    super(0, n -> BinaryLinearMatrixCounts.permutationOrbits(n.intValue(), false));
  }
}
