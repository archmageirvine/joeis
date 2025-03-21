package irvine.oeis.a155;
// Generated by gen_seq4.pl 2024-12-23.ack/filter at 2024-12-23 23:24

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A155846 Primes of the form 2^p-p*q where p is prime,q=5.
 * @author Georg Fischer
 */
public class A155846 extends FilterSequence {

  /** Construct the sequence. */
  public A155846() {
    super(1, new SingleTransformSequence(1, (p, n) -> Z.TWO.pow(p).subtract(p.multiply(5)), "", new A000040()), v -> Predicates.PRIME.is(v.abs()));
  }
}
