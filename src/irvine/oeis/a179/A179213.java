package irvine.oeis.a179;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a008.A008966;

/**
 * A179213 Sum of squarefree numbers between n and 2*n (inclusive).
 * @author Georg Fischer
 */
public class A179213 extends LambdaSequence {

  private static final DirectSequence A008966 = new A008966();

  /** Construct the sequence. */
  public A179213() {
    super(1, n -> Integers.SINGLETON.sum(n, 2 * n, k -> Z.valueOf(k).multiply(A008966.a(k))));
  }
}
