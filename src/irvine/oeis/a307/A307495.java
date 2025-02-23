package irvine.oeis.a307;
// Generated by gen_seq4.pl 2024-11-22.ack/lambdan at 2024-11-22 22:47

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A307495 Expansion of Sum_{k&gt;=0} k!*((1 - sqrt(1 - 4*x))/2)^k.
 * @author Georg Fischer
 */
public class A307495 extends LambdaSequence {

  /** Construct the sequence. */
  public A307495() {
    super(0, n -> (n <= 0) ? Z.ONE : Integers.SINGLETON.sum(1, n, k -> Binomial.binomial(2L * n - k - 1, n - k).multiply(k).multiply(Functions.FACTORIAL.z(k))).divide(n));
  }
}
