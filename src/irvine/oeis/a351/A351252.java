package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-06-16/lambdan at 2024-06-16 23:57

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A351252 a(n) = sigma(n) * A276086(n), pointwise product of the sum of divisors function and the primorial base exp-function.
 * @author Georg Fischer
 */
public class A351252 extends LambdaSequence {

  /** Construct the sequence. */
  public A351252() {
    super(1, n -> Functions.SIGMA.z(1, n).multiply(Functions.PRIMORIAL_BASE_EXP.z(n)));
  }
}
