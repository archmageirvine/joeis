package irvine.oeis.a353;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353309 The maximum sum of base-3 digits occurring among all numbers reached after n, when iterating map x -&gt; A353313(x) starting from x=n, or -1 if no finite cycle is ever reached.
 * @author Gregory Morse
 */
public class A353309 extends LambdaSequence {
  /** Construct the sequence. */
  public A353309() {
    super(0, n -> A353311.orbit(Z.valueOf(n)).afterFirst().map(k -> Functions.DIGIT_SUM.z(3, k)).max(Z::compareTo).orElseThrow());
  }
}
