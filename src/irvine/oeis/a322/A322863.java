package irvine.oeis.a322;
// Generated by gen_seq4.pl 2024-07-15/lambdin at 2024-07-15 19:12

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a005.A005940;
import irvine.oeis.a122.A122111;

/**
 * A322863 Permutation of natural numbers: a(0) = 1; for n &gt;= 1, a(n) = A005940(1+A122111(n)).
 * @author Georg Fischer
 */
public class A322863 extends LambdaSequence {

  private static final DirectSequence A005940 = new A005940();
  private static final DirectSequence A122111 = new A122111();

  /** Construct the sequence. */
  public A322863() {
    super(0, n -> A005940.a(A122111.a(n).add(1)), "1");
  }
}
