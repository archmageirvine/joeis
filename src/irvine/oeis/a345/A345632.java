package irvine.oeis.a345;
// Generated by gen_seq4.pl 2025-07-11.ack/lambdan at 2025-07-11 21:53

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A345632 Sum of terms of even index in the binomial decomposition of n^(n-1).
 * @author Georg Fischer
 */
public class A345632 extends LambdaSequence {

  /** Construct the sequence. */
  public A345632() {
    super(1, n -> Integers.SINGLETON.sum(0, (n - 1) / 2, k -> Z.valueOf(n - 1).pow(2 * k).multiply(Binomial.binomial(n - 1, 2 * k))));
  }
}
