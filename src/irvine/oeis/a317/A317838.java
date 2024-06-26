package irvine.oeis.a317;
// Generated by gen_seq4.pl 2024-04-25/lambdir at 2024-04-25 23:20

import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a002.A002487;

/**
 * A317838 a(n) = Sum_{d|n} A002487(d).
 * @author Georg Fischer
 */
public class A317838 extends LambdaSequence {

  private static final DirectSequence SEQ = new A002487();

  /** Construct the sequence. */
  public A317838() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> SEQ.a(d)));
  }
}
