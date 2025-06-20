package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-05-29.ack/lambdan at 2025-05-29 22:38

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A383277 The number of divisors d of n for which A034444(d)*d is equal to n.
 * @author Georg Fischer
 */
public class A383277 extends LambdaSequence {

  /** Construct the sequence. */
  public A383277() {
    super(1, n -> Integers.SINGLETON.countdiv(n, d -> Functions.USIGMA0.z(d).multiply(d).equals(Z.valueOf(n))));
  }
}
