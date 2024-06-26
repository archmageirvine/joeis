package irvine.oeis.a229;
// Generated by gen_seq4.pl 2024-06-21/lambdan at 2024-06-22 00:01

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A229340 Euler totient function of the arithmetic derivative of n: a(n) = phi(n'), a(1) = 0.
 * @author Georg Fischer
 */
public class A229340 extends LambdaSequence {

  /** Construct the sequence. */
  public A229340() {
    super(1, n -> (n == 1) ? Z.ZERO : Functions.PHI.z(Functions.ARD.z(n)));
  }
}
