package irvine.oeis.a166;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A166330 a(n) = (prime(n+1)+1)^(prime(n+1)-1) - (prime(n)-1)^(prime(n)+1).
 * @author Georg Fischer
 */
public class A166330 extends LambdaSequence {

  /** Construct the sequence. */
  public A166330() {
    super(1, n -> Functions.PRIME.z(n + 1).add(Z.ONE).pow(Functions.PRIME.z(n + 1).subtract(Z.ONE)).subtract(Functions.PRIME.z(n).subtract(Z.ONE).pow(Functions.PRIME.z(n).add(Z.ONE))));
  }
}
