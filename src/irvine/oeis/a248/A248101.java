package irvine.oeis.a248;
// Generated by gen_seq4.pl 2023-09-24/mult at 2023-09-24 21:44

import irvine.math.function.Functions;
import irvine.oeis.MultiplicativeSequence;

/**
 * A248101 Completely multiplicative with a(prime(n)) = prime(n)^((n+1) mod 2).
 * @author Georg Fischer
 */
public class A248101 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A248101() {
    super(1, (p, e) -> p.pow((Functions.PRIME_PI.l(p) + 1) % 2).pow(e));
  }
}
