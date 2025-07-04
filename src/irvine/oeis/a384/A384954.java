package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-06-22.ack/filter at 2025-06-22 22:11

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A384954 Primes such that moving the last digit to the front produces a triangular number.
 * @author Georg Fischer
 */
public class A384954 extends FilterSequence {

  /** Construct the sequence. */
  public A384954() {
    super(1, new A000040(), p -> Predicates.TRIANGULAR.is(Functions.ROTATE_RIGHT.z(p)));
  }
}
