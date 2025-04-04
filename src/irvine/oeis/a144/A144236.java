package irvine.oeis.a144;
// Generated by gen_seq4.pl 2025-03-26.ack/filter at 2025-03-26 22:40

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A144236 Prime numbers of the form 7^k +- 6.
 * @author Georg Fischer
 */
public class A144236 extends FilterSequence {

  /** Construct the sequence. */
  public A144236() {
    super(1, new LambdaSequence(3, n -> Z.SEVEN.pow(n / 2).add((n & 1) == 0 ? -6 : 6)), v -> Predicates.STRONG_PSEUDOPRIME.is(v));
  }
}
