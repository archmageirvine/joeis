package irvine.oeis.a340;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a000.A000670;

/**
 * A340838 a(n) = (1/2) * Sum_{k&gt;=0} (k*(k + n))^n / 2^k.
 * @author Georg Fischer
 */
public class A340838 extends LambdaSequence {

  private static final DirectSequence A000670 = new A000670();

  /** Construct the sequence. */
  public A340838() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(A000670.a(2 * n - k)).multiply(Z.valueOf(n).pow(Z.valueOf(k)))));
  }
}
