package irvine.oeis.a360;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A360708 Expansion of Sum_{k&gt;=0} (x^2 / (1 - k*x))^k.
 * a(n) = sum(k=1,floor(n/2),k^(n-2*k) * binom(n-k-1,k-1))
 * @author Georg Fischer
 */
public class A360708 extends LambdaSequence {

  /** Construct the sequence. */
  public A360708() {
    super(0, n -> (n == 0) ? Z.ONE : Integers.SINGLETON.sum(1, n / 2, k -> Z.valueOf(k).pow(n - 2L * k).multiply(Binomial.binomial(n - k - 1, k - 1))));
  }
}
