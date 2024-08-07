package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-07-21/lambdan at 2024-07-22 00:06

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A353361 Number of divisors d of n for which A156552(d) is not a multiple of 3.
 * @author Georg Fischer
 */
public class A353361 extends LambdaSequence {

  private static final DirectSequence A353269 = new A353269();

  /** Construct the sequence. */
  public A353361() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.ONE.subtract(A353269.a(d))));
  }
}
