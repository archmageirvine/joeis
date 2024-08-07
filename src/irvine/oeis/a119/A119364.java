package irvine.oeis.a119;
// Generated by gen_seq4.pl 2024-04-17/lambdan at 2024-04-17 19:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A119364 Central coefficients of number triangle A119335.
 * @author Georg Fischer
 */
public class A119364 extends LambdaSequence {

  /** Construct the sequence. */
  public A119364() {
    super(0, n -> n == 0 ? Z.ZERO : Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n + 1, 3L * k).multiply(Binomial.binomial(n - 1, 3L * k))));
  }
}
