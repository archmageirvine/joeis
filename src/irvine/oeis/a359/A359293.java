package irvine.oeis.a359;
// Generated by gen_seq4.pl 2024-03-07/lambdan at 2024-03-07 22:01

import irvine.factor.prime.Puma;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A359293 a(n) = greatest prime &lt; binomial(2n, n).
 * @author Georg Fischer
 */
public class A359293 extends LambdaSequence {

  /** Construct the sequence. */
  public A359293() {
    super(2, n -> Puma.prevPrimeZ(Binomial.binomial(2 * n, n)));
  }
}
