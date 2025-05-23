package irvine.oeis.a155;
// Generated by gen_seq4.pl 2025-04-28.ack/lambdan at 2025-04-28 23:36

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a154.A154579;

/**
 * A155027 A154579(n+2)+A154579(n).
 * @author Georg Fischer
 */
public class A155027 extends LambdaSequence {

  private static final DirectSequence A154579 = new A154579();

  /** Construct the sequence. */
  public A155027() {
    super(0, n -> A154579.a(n + 3).add(A154579.a(n + 1)));
  }
}
