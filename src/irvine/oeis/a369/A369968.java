package irvine.oeis.a369;
// Generated by gen_seq4.pl 2024-02-26/lambdan at 2024-02-26 19:18

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A369968 a(n) = 1 if n is not multiple of 5, but its arithmetic derivative is, otherwise 0.
 * @author Georg Fischer
 */
public class A369968 extends LambdaSequence {

  /** Construct the sequence. */
  public A369968() {
    super(0, n -> (n % 5 != 0 && Jaguar.factor(n).arithmeticDerivative().mod(Z.FIVE).isZero()) ? Z.ONE : Z.ZERO);
  }
}
