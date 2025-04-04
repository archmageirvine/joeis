package irvine.oeis.a098;
// Generated by gen_seq4.pl 2025-03-28.ack/filnum at 2025-03-28 22:47

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A098767 Deficient numbers whose reversal is also a deficient number.
 * @author Georg Fischer
 */
public class A098767 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A098767() {
    super(1, 0, k -> Predicates.DEFICIENT.is(k) && Predicates.DEFICIENT.is(Functions.REVERSE.z(k)));
  }
}
