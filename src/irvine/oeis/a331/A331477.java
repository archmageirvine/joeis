package irvine.oeis.a331;
// Generated by gen_seq4.pl 2024-03-07/lambdan at 2024-03-07 22:01

import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A331477 Number of n element multisets of n element multisets of an n-set.
 * @author Georg Fischer
 */
public class A331477 extends LambdaSequence {

  /** Construct the sequence. */
  public A331477() {
    super(0, n -> Binomial.binomial(Binomial.binomial(2L * n - 1, n).add(n - 1), n));
  }
}
