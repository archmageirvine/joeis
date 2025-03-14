package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-01-01.ack/lambdan at 2025-01-01 23:25

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a135.A135318;

/**
 * A379530 a(n) = (A135318(3*n) + A135318(3*n+1) + A135318(3*n+2))/3.
 * @author Georg Fischer
 */
public class A379530 extends LambdaSequence {

  private static final DirectSequence A135318 = new A135318();

  /** Construct the sequence. */
  public A379530() {
    super(0, n -> A135318.a(3 * n).add(A135318.a(3 * n + 1)).add(A135318.a(3 * n + 2)).divide(3));
  }
}
