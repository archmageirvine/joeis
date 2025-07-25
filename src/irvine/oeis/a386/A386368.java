package irvine.oeis.a386;
// Generated by gen_seq4.pl 2025-07-21.ack/lambdan at 2025-07-21 18:34

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A386368 a(n) = Sum_{k=0..n-1} binomial(6*k,k) * binomial(6*n-6*k-2,n-k-1).
 * @author Georg Fischer
 */
public class A386368 extends LambdaSequence {

  /** Construct the sequence. */
  public A386368() {
    super(0, n -> Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(6 * k, k).multiply(Binomial.binomial(6 * n - 6 * k - 2, n - k - 1))));
  }
}
