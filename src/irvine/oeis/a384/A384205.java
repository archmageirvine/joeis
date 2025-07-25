package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-05-26.ack/lambdan at 2025-05-26 23:11

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A384205 a(n) = [x^(2*n)] Product_{k=0..n} 1/(1 - k*x)^2.
 * @author Georg Fischer
 */
public class A384205 extends LambdaSequence {

  /** Construct the sequence. */
  public A384205() {
    super(0, n -> Integers.SINGLETON.sum(0, 2 * n, k -> Functions.STIRLING2.z(n + k, n).multiply(Functions.STIRLING2.z(3 * n - k, n))));
  }
}
