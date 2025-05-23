package irvine.oeis.a078;
// Generated by gen_seq4.pl 2025-05-05.ack/filter at 2025-05-05 23:11

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a055.A055394;

/**
 * A078390 Composite numbers which can be written as sum of a positive square and a positive cube.
 * @author Georg Fischer
 */
public class A078390 extends FilterSequence {

  /** Construct the sequence. */
  public A078390() {
    super(1, new A055394(), v -> !Predicates.PRIME.is(v));
  }
}
