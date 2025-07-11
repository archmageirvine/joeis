package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-06-03.ack/lambdan at 2025-06-03 20:14

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A384471 a(n) = Sum_{k=0..n} binomial(n,k)^2 * Stirling2(2*k,k) * Stirling2(2*n-2*k,n-k).
 * @author Georg Fischer
 */
public class A384471 extends LambdaSequence {

  /** Construct the sequence. */
  public A384471() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).square().multiply(Functions.STIRLING2.z(2 * k, k)).multiply(Functions.STIRLING2.z(2 * n - 2 * k, n - k))));
  }
}
