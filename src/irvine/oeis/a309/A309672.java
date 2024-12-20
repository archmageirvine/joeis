package irvine.oeis.a309;
// Generated by gen_seq4.pl 2024-12-02.ack/filter at 2024-12-02 23:40

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007755;

/**
 * A309672 Composite terms of A007755.
 * @author Georg Fischer
 */
public class A309672 extends FilterSequence {

  /** Construct the sequence. */
  public A309672() {
    super(1, new A007755().skip(1), v -> !Predicates.PRIME.is(v));
  }
}
