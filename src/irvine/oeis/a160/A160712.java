package irvine.oeis.a160;
// Generated by gen_seq4.pl 2025-05-30.ack/filter at 2025-05-30 21:48

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a134.A134808;

/**
 * A160712 Composite cyclops numbers (A134808).
 * @author Georg Fischer
 */
public class A160712 extends FilterSequence {

  /** Construct the sequence. */
  public A160712() {
    super(1, new A134808().skip(1), v -> !Predicates.PRIME.is(v));
  }
}
