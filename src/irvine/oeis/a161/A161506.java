package irvine.oeis.a161;
// Generated by gen_seq4.pl 2024-09-11.ack/lambdan at 2024-09-11 23:28

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A161506 Number of divisors of n that are greater than phi(n)/2, where phi is Euler's totient function.
 * @author Georg Fischer
 */
public class A161506 extends LambdaSequence {

  /** Construct the sequence. */
  public A161506() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> 2L * d > Functions.PHI.l(n) ? Z.ONE : Z.ZERO));
  }
}
