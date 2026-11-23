package irvine.oeis.a353;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353310 Number of terms before entering the cycle under iteration of A353313.
 * @author Gregory Morse
 */
public class A353310 extends LambdaSequence {
  /** Construct the sequence. */
  public A353310() {
    super(0, n -> Z.valueOf(A353311.orbit(Z.valueOf(n)).tailLength()));
  }
}
