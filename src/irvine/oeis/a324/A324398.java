package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-07-15/lambdan at 2024-07-15 19:12

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a156.A156552;
import irvine.oeis.a323.A323243;

/**
 * A324398 a(1) = 0; for n &gt; 1, a(n) = A318458(A156552(n)).
 * @author Georg Fischer
 */
public class A324398 extends LambdaSequence {

  private static final DirectSequence A156552 = new A156552();
  private static final DirectSequence A323243 = new A323243();

  /** Construct the sequence. */
  public A324398() {
    super(1, n -> A156552.a(n).and(A323243.a(n).subtract(A156552.a(n))));
  }
}
