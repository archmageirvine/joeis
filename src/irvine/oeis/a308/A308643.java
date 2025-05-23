package irvine.oeis.a308;
// Generated by gen_seq4.pl 2025-05-05.ack/filter at 2025-05-05 23:11

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046347;

/**
 * A308643 Odd squarefree composite numbers k, divisible by the sum of their prime factors, sopfr (A001414).
 * @author Georg Fischer
 */
public class A308643 extends FilterSequence {

  /** Construct the sequence. */
  public A308643() {
    super(1, new A046347(), v -> Predicates.SQUARE_FREE.is(v));
  }
}
