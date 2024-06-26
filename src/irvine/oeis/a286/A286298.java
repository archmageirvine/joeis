package irvine.oeis.a286;
// Generated by gen_seq4.pl 2024-06-17/lambdan at 2024-06-17 23:19

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a000.A000523;
import irvine.oeis.a005.A005811;

/**
 * A286298 a(0) = 0, a(1) = 1; thereafter, a(2n) = a(n) + 1 + (n mod 2), a(2n+1) = a(n) + 2 - (n mod 2).
 * @author Georg Fischer
 */
public class A286298 extends LambdaSequence {

  private static final DirectSequence A000523 = new A000523();
  private static final DirectSequence A005811 = new A005811();

  /** Construct the sequence. */
  public A286298() {
    super(0, n -> (n <= 1) ? Z.valueOf(n) : A005811.a(n).add(A000523.a(n)));
  }
}
