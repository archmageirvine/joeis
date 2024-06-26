package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-06-16/lambdan at 2024-06-16 23:57

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a181.A181819;

/**
 * A353576 Arithmetic derivative applied to the prime shadow of the primorial base exp-function: a(n) = A003415(A181819(A276086(n))).
 * @author Georg Fischer
 */
public class A353576 extends LambdaSequence {

  private static final DirectSequence A181819 = new A181819();

  /** Construct the sequence. */
  public A353576() {
    super(0, n -> Functions.ARD.z(A181819.a(Functions.PRIMORIAL_BASE_EXP.z(n))));
  }
}
