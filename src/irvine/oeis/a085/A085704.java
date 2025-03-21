package irvine.oeis.a085;
// Generated by gen_seq4.pl 2025-01-03.ack/filprof at 2025-01-06 00:11

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A085704 Primes of the form prime(k)*2 - prime(k-1), k&gt;1.
 * @author Georg Fischer
 */
public class A085704 extends FilterSequence {

  /** Construct the sequence. */
  public A085704() {
    super(1, new LambdaSequence(2, k -> Functions.PRIME.z(k).multiply(2).subtract(Functions.PRIME.z(k - 1))), PRIME);
  }
}
