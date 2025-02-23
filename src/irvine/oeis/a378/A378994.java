package irvine.oeis.a378;
// Generated by gen_seq4.pl 2024-12-15.ack/lambdan at 2024-12-15 23:09

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A378994 a(n) = gcd(2*n, sigma(2*n)).
 * @author Georg Fischer
 */
public class A378994 extends LambdaSequence {

  /** Construct the sequence. */
  public A378994() {
    super(1, n -> Functions.GCD.z(2L * n, Functions.SIGMA1.z(2 * n)));
  }
}
