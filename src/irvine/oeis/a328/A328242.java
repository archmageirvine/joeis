package irvine.oeis.a328;
// Generated by gen_seq4.pl 2025-06-15.ack/filtpos at 2025-06-15 21:33

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a370.A370130;

/**
 * A328242 Numbers k such that A003415(A276086(k)) is a squarefree number, where A003415 is the arithmetic derivative, and A276086 is the primorial base exp-function.
 * @author Georg Fischer
 */
public class A328242 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A328242() {
    super(1, 0, new A370130(), ONE);
  }
}
