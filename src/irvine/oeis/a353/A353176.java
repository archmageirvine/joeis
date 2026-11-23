package irvine.oeis.a353;

import irvine.math.turing.SnakeTally;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353176 Maximum length of a finite square-grid snake following n-periodic instructions.
 * @author Gregory Morse
 */
public class A353176 extends LambdaSequence {

  /** Construct the sequence. */
  public A353176() {
    super(5, n -> Z.valueOf(SnakeTally.maximum(Math.toIntExact(n))));
  }
}
