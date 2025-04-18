package irvine.oeis.a357;
// Generated by gen_seq4.pl 2024-12-02.ack/filter at 2024-12-02 23:40

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a091.A091191;

/**
 * A357696 Cubefree primitive abundant numbers: cubefree abundant numbers having no abundant proper divisor.
 * @author Georg Fischer
 */
public class A357696 extends FilterSequence {

  /** Construct the sequence. */
  public A357696() {
    super(1, new A091191(), v -> Predicates.CUBE_FREE.is(v));
  }
}
