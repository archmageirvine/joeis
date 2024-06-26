package irvine.oeis.a225;
// Generated by gen_seq4.pl 2023-10-28/mulr at 2023-10-29 22:37

import irvine.math.function.Functions;
import irvine.oeis.MultiplicativeSequence;

/**
 * A225395 Replace each prime number with its rank in the recursive prime factorization of n.
 * Multiplicative with: a(prime(i)^j) = i^a(j).
 * @author Georg Fischer
 */
public class A225395 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A225395() {
    super(1, (self, p, e) -> Functions.PRIME_PI.z(p).pow(self.a(e)));
  }
}
