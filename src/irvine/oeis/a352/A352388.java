package irvine.oeis.a352;

import irvine.math.turing.SnakeTally;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A352388 Number of solutions to Snake Number Problem for snakes with n-periodic instructions in an infinite square grid.
 * @author Gregory Morse
 */
public class A352388 extends LambdaSequence {

  /** Construct the sequence. */
  public A352388() {
    super(1, n -> Z.valueOf(SnakeTally.count(Math.toIntExact(n))));
  }
}
