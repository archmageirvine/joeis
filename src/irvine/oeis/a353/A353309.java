package irvine.oeis.a353;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353309 Largest ternary digit sum reached after the first step of the orbit under A353313.
 * @author Gregory Morse
 */
public class A353309 extends LambdaSequence {
  /** Construct the sequence. */
  public A353309() {
    super(0, n -> A353311.orbit(Z.valueOf(n)).afterFirst().map(k -> Functions.DIGIT_SUM.z(3, k)).max(Z::compareTo).orElseThrow());
  }
}
