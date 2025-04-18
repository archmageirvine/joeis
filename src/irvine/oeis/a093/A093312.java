package irvine.oeis.a093;
// Generated by gen_seq4.pl 2025-03-25.ack/lambmin11 at 2025-03-26 22:32

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.LeastLambdaSequence;

/**
 * A093312 Least k such that (2n + 2k) + 1 and (2n*2k) + 1 are both primes.
 * @author Georg Fischer
 */
public class A093312 extends LeastLambdaSequence {

  /** Construct the sequence. */
  public A093312() {
    super(1, (n, k) -> Predicates.PRIME.is(2 * n + 2 * k + 1) && Predicates.PRIME.is(Z.valueOf(2 * n).multiply(2 * k).add(1)), 1, ONE);
  }
}
