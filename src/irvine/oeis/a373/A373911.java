package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-06-26/lambdan at 2024-06-26 17:12

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A373911 Number of compositions of 7*n into parts 5 and 7.
 * @author Georg Fischer
 */
public class A373911 extends LambdaSequence {

  /** Construct the sequence. */
  public A373911() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 5, k -> Binomial.binomial(n + 2L * k, n - 5L * k)));
  }
}
