package irvine.oeis.a323;
// Generated by gen_seq4.pl 2024-07-21/lambdan at 2024-07-22 00:06

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a276.A276154;

/**
 * A323879 Number of divisors d of n such that A276154(d) divides n.
 * @author Georg Fischer
 */
public class A323879 extends LambdaSequence {

  private static final DirectSequence A276154 = new A276154();

  /** Construct the sequence. */
  public A323879() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(n).mod(A276154.a(d)).isZero() ? Z.ONE : Z.ZERO));
  }
}
