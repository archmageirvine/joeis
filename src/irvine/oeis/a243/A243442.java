package irvine.oeis.a243;
// Generated by gen_seq4.pl 2025-07-21.ack/filter at 2025-07-21 18:34

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A243442 Primes p such that, in base 2, p - digitsum(p) is also a prime.
 * @author Georg Fischer
 */
public class A243442 extends FilterSequence {

  /** Construct the sequence. */
  public A243442() {
    super(1, new A000040(), p -> Predicates.PRIME.is(p.subtract(Functions.DIGIT_SUM.z(2, p))));
  }
}
