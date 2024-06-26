package irvine.oeis.a347;
// Generated by gen_seq4.pl 2024-06-20/lambdan at 2024-06-20 23:44

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a332.A332449;

/**
 * A347119 Squarefree part of A005940(1+(3*A156552(n))): a(n) = A007913(A332449(n)).
 * @author Georg Fischer
 */
public class A347119 extends LambdaSequence {

  private static final DirectSequence A332449 = new A332449();

  /** Construct the sequence. */
  public A347119() {
    super(1, n -> Functions.CORE.z(A332449.a(n)));
  }
}
