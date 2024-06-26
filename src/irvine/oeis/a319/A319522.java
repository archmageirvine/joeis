package irvine.oeis.a319;
// Generated by gen_seq4.pl mult3man/mult at 2023-10-07 22:14

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A319522 Completely multiplicative with a(prime(2*k)) = prime(k) and a(prime(2*k-1)) = 1 for any k &gt; 0 (where prime(k) denotes the k-th prime number).
 * Multiplicative with: Completely multiplicative with a(prime(2*k)) = prime(k) and a(prime(2*k-1)) = 1 for any k > 0 (where prime(k) denotes the k-th prime number).
 * @author Georg Fischer
 */
public class A319522 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A319522() {
    super(1, (p, e) -> {
      final long pi = Functions.PRIME_PI.l(p);
      return ((pi & 1) == 0) ? Functions.PRIME.z(pi / 2).pow(e) : Z.ONE;
    });
  }
}
