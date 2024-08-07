package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-06-26/lambdan at 2024-06-26 17:12

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A373960 Number of compositions of 6*n-5 into parts 1 and 6.
 * @author Georg Fischer
 */
public class A373960 extends LambdaSequence {

  /** Construct the sequence. */
  public A373960() {
    super(1, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n + 5L * k, n - 1 - k)));
  }
}
