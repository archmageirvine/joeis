package irvine.oeis.a083;
// Generated by gen_seq4.pl 2025-04-22.ack/filter at 2025-04-22 22:21

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A083674 Triangular numbers whose sum of divisors is also a triangular number.
 * @author Georg Fischer
 */
public class A083674 extends FilterSequence {

  /** Construct the sequence. */
  public A083674() {
    super(1, new A000217().skip(1), v -> Predicates.TRIANGULAR.is(Functions.SIGMA1.z(v)));
  }
}
