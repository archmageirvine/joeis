package irvine.oeis.a358;
// Generated by gen_seq4.pl 2024-06-16/lambdan at 2024-06-16 23:57

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A358220 a(n) = 1 if A276086(n) is a multiple of A003415(n), with a(0) = a(1) = 0. Here A003415 is the arithmetic derivative, and A276086 is the primorial base exp-function.
 * @author Georg Fischer
 */
public class A358220 extends LambdaSequence {

  /** Construct the sequence. */
  public A358220() {
    super(0, n -> n <= 1 ? Z.ZERO : (Functions.PRIMORIAL_BASE_EXP.z(n).mod(Functions.ARD.z(n)).isZero() ? Z.ONE : Z.ZERO));
  }
}
