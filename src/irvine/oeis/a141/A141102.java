package irvine.oeis.a141;
// Generated by gen_seq4.pl 2024-09-21.ack/lambdan at 2024-09-21 22:07

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A141102 a(n) = prime(2^n) - n^2.
 * @author Georg Fischer
 */
public class A141102 extends LambdaSequence {

  /** Construct the sequence. */
  public A141102() {
    super(1, n -> Functions.PRIME.z(Z.TWO.pow(n)).subtract(Z.valueOf(n).square()));
  }
}
