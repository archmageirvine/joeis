package irvine.oeis.a353;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353305 Minimum value reached after the first step of the orbit under A353313.
 * @author Gregory Morse
 */
public class A353305 extends LambdaSequence {
  /** Construct the sequence. */
  public A353305() {
    super(0, n -> A353311.orbit(Z.valueOf(n)).afterFirst().min(Z::compareTo).orElseThrow());
  }
}
