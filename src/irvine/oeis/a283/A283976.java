package irvine.oeis.a283;
// Generated by gen_seq4.pl 2024-07-01/lambdan at 2024-07-01 18:26

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a002.A002487;

/**
 * A283976 a(2n) = A002487(n), a(2n+1) = A002487(n) OR A002487(n+1), where OR is bitwise-or (A003986).
 * @author Georg Fischer
 */
public class A283976 extends LambdaSequence {

  private static final DirectSequence A002487 = new A002487();

  /** Construct the sequence. */
  public A283976() {
    super(0, n -> ((n & 1) == 0) ? A002487.a(n / 2) : A002487.a(n / 2).or(A002487.a(n / 2 + 1)));
  }
}
