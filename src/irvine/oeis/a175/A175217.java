package irvine.oeis.a175;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdan at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a010.A010051;

/**
 * A175217 The second nonprimes after the primes.
 * @author Georg Fischer
 */
public class A175217 extends LambdaSequence {

  private static final DirectSequence A010051 = new A010051();

  /** Construct the sequence. */
  public A175217() {
    super(1, n -> Functions.PRIME.z(n).add(2).add(A010051.a(Functions.PRIME.z(n).add(1))).add(A010051.a(Functions.PRIME.z(n).add(2))).add(A010051.a(Functions.PRIME.z(n).add(3))));
  }
}
