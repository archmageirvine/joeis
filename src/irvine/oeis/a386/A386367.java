package irvine.oeis.a386;
// Generated by gen_seq4.pl 2025-07-21.ack/lambdan at 2025-07-21 18:34

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A386367 a(n) = Sum_{k=0..n-1} binomial(5*k,k) * binomial(5*n-5*k-2,n-k-1).
 * @author Georg Fischer
 */
public class A386367 extends LambdaSequence {

  /** Construct the sequence. */
  public A386367() {
    super(0, n -> Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(5 * k, k).multiply(Binomial.binomial(5 * n - 5 * k - 2, n - k - 1))));
  }
}
