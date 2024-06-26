package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-06-16/lambdan at 2024-06-16 23:57

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.oeis.LambdaSequence;

/**
 * A351230 Numerator of A003415(n) / A276086(n), where A003415 is the arithmetic derivative and A276086 is the primorial base exp-function.
 * @author Georg Fischer
 */
public class A351230 extends LambdaSequence {

  /** Construct the sequence. */
  public A351230() {
    super(0, n -> new Q(Functions.ARD.z(n), Functions.PRIMORIAL_BASE_EXP.z(n)).num());
  }
}
