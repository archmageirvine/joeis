package irvine.oeis.a246;
// Generated by gen_seq4.pl 2024-12-23.ack/multrar at 2024-12-23 23:24

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A246377 Permutation of natural numbers: a(1) = 1, a(p_n) = 2*a(n)+1, a(c_n) = 2*a(n), where p_n = n-th prime = A000040(n), c_n = n-th composite number = A002808(n).
 * @author Georg Fischer
 */
public class A246377 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A246377() {
    super(1, (self, n) -> Predicates.PRIME.is(n) ? self.a(Functions.PRIME_PI.i(n)).multiply(2).add(1) : self.a(n - Functions.PRIME_PI.i(n) - 1).multiply(2), "1");
  }
}
