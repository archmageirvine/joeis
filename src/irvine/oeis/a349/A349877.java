package irvine.oeis.a349;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A349877 Steps to reach a multiple of 3 under iteration of A353314.
 * @author Gregory Morse
 */
public class A349877 extends LambdaSequence {
  /** Construct the sequence. */
  public A349877() {
    super(0, n -> A349876.firstMultiple(Z.valueOf(n), true));
  }
}
