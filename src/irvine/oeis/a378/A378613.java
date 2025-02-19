package irvine.oeis.a378;
// Generated by gen_seq4.pl 2024-12-08.ack/lambdan at 2024-12-08 22:31

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A378613 a(n) = Sum_{k=0..n} binomial(4*n+k-1,k) * binomial(n-1,n-k).
 * @author Georg Fischer
 */
public class A378613 extends LambdaSequence {

  /** Construct the sequence. */
  public A378613() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(4L * n + k - 1, k).multiply(Binomial.binomial(n - 1, n - k))));
  }
}
