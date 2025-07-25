package irvine.oeis.a369;
// Generated by gen_seq4.pl 2025-06-03.ack/mulr at 2025-06-03 20:14

import irvine.math.function.Functions;
import irvine.oeis.MultiplicativeSequence;

/**
 * A369015 Matula-Goebel number of the prime tower factorization tree of n.
 * Multiplicative with: for prime p
 * @author Georg Fischer
 */
public class A369015 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A369015() {
    super(1, (self, p, e) -> Functions.PRIME.z(self.a(e)));
  }
}
