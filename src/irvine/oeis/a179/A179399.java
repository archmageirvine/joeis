package irvine.oeis.a179;
// Generated by gen_seq4.pl 2025-03-31.ack/lambdan at 2025-03-31 23:38

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A179399 Prime(n)^2 mod prime(n-4).
 * @author Georg Fischer
 */
public class A179399 extends LambdaSequence {

  /** Construct the sequence. */
  public A179399() {
    super(5, n -> Functions.PRIME.z(n).square().mod(Functions.PRIME.z(n - 4)));
  }
}
