package irvine.oeis.a141;
// Generated by gen_seq4.pl 2024-07-26/lambdan at 2024-07-27 00:11

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A141078 a(n) = abs(prime(n)*prime(n+4) - prime(n+1)*prime(n+3)).
 * @author Georg Fischer
 */
public class A141078 extends LambdaSequence {

  /** Construct the sequence. */
  public A141078() {
    super(1, n -> (Functions.PRIME.z(n).multiply(Functions.PRIME.z(n + 4)).subtract(Functions.PRIME.z(n + 1).multiply(Functions.PRIME.z(n + 3)))).abs());
  }
}
