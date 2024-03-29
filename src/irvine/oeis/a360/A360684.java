package irvine.oeis.a360;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A360684 Expansion of Sum_{k&gt;=0} (x * (1 + k^2 * x))^k.
 * a(n) = sum(k=0,n\2,(n-k)^(2*k)*binom(n-k,k));
 * @author Georg Fischer
 */
public class A360684 extends LambdaSequence {

  /** Construct the sequence. */
  public A360684() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 2, k -> Z.valueOf(n - k).pow(2L * k).multiply(Binomial.binomial(n - k, k))));
  }
}
