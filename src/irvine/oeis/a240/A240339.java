package irvine.oeis.a240;
// Generated by gen_seq4.pl 2024-09-29.ack/filter at 2024-09-29 22:15

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A240339 Primes p which are floor of Root-Mean-Cube (RMC) of prime(n) and prime(n+1).
 * @author Georg Fischer
 */
public class A240339 extends FilterSequence {

  /** Construct the sequence. */
  public A240339() {
    super(1, new LambdaSequence(1, n -> Functions.SQRT.z(Functions.PRIME.z(n).pow(3).add(Functions.PRIME.z(n + 1).pow(3)).divide(2))), v -> v.isProbablePrime());
  }
}
