package irvine.oeis.a353;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353310 Number of terms encountered when iterating A353313, before reaching the first term that is a part of a finite cycle, or -1 if no finite cycle is ever reached.
 * @author Gregory Morse
 */
public class A353310 extends LambdaSequence {
  /** Construct the sequence. */
  public A353310() {
    super(0, n -> Z.valueOf(A353311.orbit(Z.valueOf(n)).tailLength()));
  }
}
