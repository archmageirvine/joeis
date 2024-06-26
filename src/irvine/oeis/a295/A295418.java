package irvine.oeis.a295;
// Generated by gen_seq4.pl 2023-08-30/lambda at 2023-08-31 21:50

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A295418 a(n) = n! * Laguerre(n, n*(n-1), -n).
 * @author Georg Fischer
 */
public class A295418 extends LambdaSequence {

  /** Construct the sequence. */
  public A295418() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial((long) n * n, n - k).multiply(Z.valueOf(n).pow(k)), Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
