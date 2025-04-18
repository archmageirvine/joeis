package irvine.oeis.a111;
// Generated by gen_seq4.pl 2024-12-09.ack/filter at 2024-12-09 23:32

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A111351 Semiprimes of the form 2*n + 1, where n is a square.
 * @author Georg Fischer
 */
public class A111351 extends FilterSequence {

  /** Construct the sequence. */
  public A111351() {
    super(1, new LambdaSequence(1, k -> Z.valueOf(2L * k).multiply(k).add(1)), v -> Predicates.SEMIPRIME.is(v));
  }
}
