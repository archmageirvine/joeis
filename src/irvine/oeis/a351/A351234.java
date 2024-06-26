package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-06-16/lambdan at 2024-06-16 23:57

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A351234 a(n) = A276085(gcd(A003415(n), A276086(n))).
 * @author Georg Fischer
 */
public class A351234 extends LambdaSequence {

  /** Construct the sequence. */
  public A351234() {
    super(0, n -> Functions.PRIMORIAL_BASE_LOG.z(Functions.GCD.z(Functions.ARD.z(n), Functions.PRIMORIAL_BASE_EXP.z(n))));
  }
}
