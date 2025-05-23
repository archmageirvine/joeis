package irvine.oeis.a176;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a037.A037278;

/**
 * A176555 Noncomposite concatenations of divisors of some k, ordered by k.
 * @author Georg Fischer
 */
public class A176555 extends FilterSequence {

  /** Construct the sequence. */
  public A176555() {
    super(1, new A037278(), v -> Predicates.PRIME.is(v) || v.equals(Z.ONE));
  }
}
