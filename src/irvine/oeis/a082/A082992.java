package irvine.oeis.a082;
// Generated by gen_seq4.pl 2023-11-30/filter at 2023-12-03 21:34

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a178.A178914;

/**
 * A082992 Primes whose 10's complement is a triangular number.
 * @author Georg Fischer
 */
public class A082992 extends FilterSequence {

  /** Construct the sequence. */
  public A082992() {
    super(1, new A000040(), v -> Predicates.TRIANGULAR.is(new A178914().a(v)));
  }
}
