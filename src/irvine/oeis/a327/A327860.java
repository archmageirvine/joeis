package irvine.oeis.a327;
// Generated by gen_seq4.pl 2024-06-16/lambdan at 2024-06-16 23:57

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A327860 Arithmetic derivative of the primorial base exp-function: a(n) = A003415(A276086(n)).
 * @author Georg Fischer
 */
public class A327860 extends LambdaSequence {

  /** Construct the sequence. */
  public A327860() {
    super(0, n -> Functions.ARD.z(Functions.PRIMORIAL_BASE_EXP.z(n)));
  }
}
