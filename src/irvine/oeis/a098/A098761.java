package irvine.oeis.a098;
// Generated by gen_seq4.pl 2025-01-03.ack/filprof at 2025-01-06 00:11

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A098761 Primes of the form prime(n) + prime(n+1) - prime(n+2) with multiplicity, ordered by increasing n.
 * @author Georg Fischer
 */
public class A098761 extends FilterSequence {

  /** Construct the sequence. */
  public A098761() {
    super(1, new LambdaSequence(0, k -> Functions.PRIME.z(k).add(Functions.PRIME.z(k + 1)).subtract(Functions.PRIME.z(k + 2))), PRIME);
  }
}
