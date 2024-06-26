package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-06-16/lambdan at 2024-06-16 23:57

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353489 If A276086(n) is of the form 4k+3, then a(n) = 1, otherwise a(n) = 0.
 * @author Georg Fischer
 */
public class A353489 extends LambdaSequence {

  /** Construct the sequence. */
  public A353489() {
    super(0, n -> Functions.PRIMORIAL_BASE_EXP.z(n).mod(4) == 3 ? Z.ONE : Z.ZERO);
  }
}
