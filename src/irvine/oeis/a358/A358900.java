package irvine.oeis.a358;
// Generated by gen_seq4.pl 2025-02-20.ack/filter at 2025-02-20 23:05

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A358900 Primes prime(k) such that prime(k)^prime(k) &gt; prime(k-1)^prime(k+1).
 * @author Georg Fischer
 */
public class A358900 extends FilterSequence {

  /** Construct the sequence. */
  public A358900() {
    super(1, new A000040(), (k, v) -> k != 1 && Functions.PRIME.z(k).pow(Functions.PRIME.z(k)).compareTo(Functions.PRIME.z(k - 1).pow(Functions.PRIME.z(k + 1))) > 0);
  }
}
