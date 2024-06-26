package irvine.oeis.a335;
// Generated by gen_seq4.pl 2024-06-24/sintrif at 2024-06-24 23:40

import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005940;
import irvine.oeis.a248.A248663;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A335423 a(n) = A005940(1+A248663(n)).
 * @author Georg Fischer
 */
public class A335423 extends SingleTransformSequence {

  private static final DirectSequence A005940 = new A005940();

  /** Construct the sequence. */
  public A335423() {
    super(1, (term, n) -> A005940.a(term.add(1)), "", new A248663());
  }
}
