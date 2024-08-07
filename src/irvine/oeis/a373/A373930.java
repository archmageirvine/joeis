package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-06-26/lambdan at 2024-06-26 17:12

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A373930 Number of compositions of 7*n-4 into parts 1 and 7.
 * @author Georg Fischer
 */
public class A373930 extends LambdaSequence {

  /** Construct the sequence. */
  public A373930() {
    super(1, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n + 2 + 6L * k, n - 1 - k)));
  }
}
