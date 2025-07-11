package irvine.oeis.a342;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a267.A267263;
import irvine.oeis.a329.A329886;

/**
 * A342461 Number of nonzero digits when A329886(n) is written in primorial base, where A329886 is the primorial inflation of Doudna-tree.
 * @author Georg Fischer
 */
public class A342461 extends LambdaSequence {

  private static final DirectSequence A267263 = new A267263();
  private static final DirectSequence A329886 = new A329886();

  /** Construct the sequence. */
  public A342461() {
    super(0, n -> A267263.a(A329886.a(n)));
  }
}
