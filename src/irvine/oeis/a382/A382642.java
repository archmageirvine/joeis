package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-05-24.ack/lambdan at 2025-05-24 23:04

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A382642 a(n) = Sum_{k=0..n} (binomial(n,k) * binomial(n+k,k))^2 * 2^(n-k).
 * @author Georg Fischer
 */
public class A382642 extends LambdaSequence {

  /** Construct the sequence. */
  public A382642() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Binomial.binomial(n + k, k)).square().multiply(Z.TWO.pow(n - k))));
  }
}
