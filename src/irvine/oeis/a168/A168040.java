package irvine.oeis.a168;
// Generated by gen_seq4.pl 2025-06-03.ack/filter at 2025-06-03 20:14

import irvine.math.cr.CR;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A168040 Primes p for which floor(p^E) is prime.
 * @author Georg Fischer
 */
public class A168040 extends FilterSequence {

  /** Construct the sequence. */
  public A168040() {
    super(1, new A000040(), p -> Predicates.PRIME.is(CR.valueOf(p).pow(CR.E).floor()));
  }
}
