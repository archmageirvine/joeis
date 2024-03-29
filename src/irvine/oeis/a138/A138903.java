package irvine.oeis.a138;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A138903 a(n) = (1/2^n)* Sum_{k=0..n} binomial(n,k)*(n+k)^(n-1).
 * a(n)=1/2^n*sum(k=0, n, binom(n, k)*(n+k)^(n-1))
 * @author Georg Fischer
 */
public class A138903 extends LambdaSequence {

  /** Construct the sequence. */
  public A138903() {
    super(1, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Z.valueOf(n + k).pow(n - 1))).divide(Z.TWO.pow(n)));
  }
}
