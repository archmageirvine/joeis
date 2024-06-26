package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-06-16/lambdan at 2024-06-16 23:57

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A324645 a(n) = gcd(d(n), A276086(n)), where d(n) gives the number of divisors (A000005).
 * @author Georg Fischer
 */
public class A324645 extends LambdaSequence {

  /** Construct the sequence. */
  public A324645() {
    super(1, n -> Functions.GCD.z(Functions.SIGMA.z(0, n), Functions.PRIMORIAL_BASE_EXP.z(n)));
  }
}
