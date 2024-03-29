package irvine.oeis.a360;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 11:10

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A360820 a(n) = Sum_{k=0..n} binomial(n, k)*2^(n^2-k*(n-k)).
 * a(n) = sum(k=0,n,binom(n,k)*2^(n^2-k*(n-k)));
 * @author Georg Fischer
 */
public class A360820 extends LambdaSequence {

  /** Construct the sequence. */
  public A360820() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Z.TWO.pow(Z.valueOf(n).multiply(n).subtract(Z.valueOf(k).multiply(Z.valueOf(n - k)))))));
  }
}
