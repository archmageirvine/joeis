package irvine.oeis.a346;
// Generated by gen_seq4.pl 2024-07-15/lambdan at 2024-07-15 19:12

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a324.A324886;

/**
 * A346096 Numerator of the primorial deflation of A276086(A108951(n)): a(n) = A319626(A324886(n)).
 * @author Georg Fischer
 */
public class A346096 extends LambdaSequence {

  private static final DirectSequence A324886 = new A324886();
  private static final DirectSequence A346095 = new A346095();

  /** Construct the sequence. */
  public A346096() {
    super(1, n -> A324886.a(n).divide(A346095.a(n)));
  }
}
