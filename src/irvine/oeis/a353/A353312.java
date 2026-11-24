package irvine.oeis.a353;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353312 Size of the finite cycle eventually reached by iterating A353313, or -1 if no finite cycle is ever reached.
 * @author Gregory Morse
 */
public class A353312 extends LambdaSequence {
  /** Construct the sequence. */
  public A353312() {
    super(0, n -> Z.valueOf(A353311.orbit(Z.valueOf(n)).cycleLength()));
  }
}
