package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-01.ack/lambdan at 2025-07-01 16:42

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a051.A051903;

/**
 * A385131 The sum of divisors of n whose maximum exponent in their prime factorization is odd.
 * @author Georg Fischer
 */
public class A385131 extends LambdaSequence {

  private static final DirectSequence A051903 = new A051903();

  /** Construct the sequence. */
  public A385131() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> A051903.a(d).and(Z.ONE).multiply(d)));
  }
}
