package irvine.oeis.a353;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353305 The smallest number reached after n when iterating map x -&gt; A353313(x) and starting from x=n, or -1 if no finite cycle is ever reached.
 * @author Gregory Morse
 */
public class A353305 extends LambdaSequence {
  /** Construct the sequence. */
  public A353305() {
    super(0, n -> A353311.orbit(Z.valueOf(n)).afterFirst().min(Z::compareTo).orElseThrow());
  }
}
