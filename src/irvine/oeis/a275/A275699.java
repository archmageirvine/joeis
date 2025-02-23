package irvine.oeis.a275;
// Generated by gen_seq4.pl 2025-02-13.ack/filter at 2025-02-13 23:28

import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046660;

/**
 * A275699 Excess of numbers that are not squarefree.
 * @author Georg Fischer
 */
public class A275699 extends FilterSequence {

  /** Construct the sequence. */
  public A275699() {
    super(1, new A046660(), v -> !v.isZero());
  }
}
