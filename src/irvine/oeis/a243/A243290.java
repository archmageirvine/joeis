package irvine.oeis.a243;
// Generated by gen_seq4.pl 2024-07-02/sintrif at 2024-07-03 22:28

import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005117;
import irvine.oeis.a061.A061395;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A243290 The index of the greatest prime dividing the n-th squarefree number: a(n) = A061395(A005117(n)).
 * @author Georg Fischer
 */
public class A243290 extends SingleTransformSequence {

  private static final DirectSequence A061395 = new A061395();

  /** Construct the sequence. */
  public A243290() {
    super(1, (term, n) -> A061395.a(term), "", new A005117());
  }
}
