package irvine.oeis.a245;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A245036 a(n) = 4*prime(n)^3 - 27*prime(n)^2 = (prime(n)^2)*[4*prime(n) - 27], n &gt;= 4.
 * @author Georg Fischer
 */
public class A245036 extends LambdaSequence {

  /** Construct the sequence. */
  public A245036() {
    super(4, n -> Z.FOUR.multiply(Functions.PRIME.z(n).pow(Z.THREE)).subtract(Z.valueOf(27).multiply(Functions.PRIME.z(n).square())));
  }
}
