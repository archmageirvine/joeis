package irvine.oeis.a328;
// Generated by gen_seq4.pl robots/union2 at 2023-09-04 09:14

import irvine.oeis.ComplementSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A328303 Numbers whose arithmetic derivative is not squarefree.
 * @author Georg Fischer
 */
public class A328303 extends ComplementSequence {

  /** Construct the sequence. */
  public A328303() {
    super(1, new UnionSequence(1, new A000040(), new A328234()));
  }
}
