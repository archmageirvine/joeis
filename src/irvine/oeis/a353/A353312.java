package irvine.oeis.a353;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353312 Length of the cycle reached under iteration of A353313.
 * @author Gregory Morse
 */
public class A353312 extends LambdaSequence {
  /** Construct the sequence. */
  public A353312() {
    super(0, n -> Z.valueOf(A353311.orbit(Z.valueOf(n)).cycleLength()));
  }
}
