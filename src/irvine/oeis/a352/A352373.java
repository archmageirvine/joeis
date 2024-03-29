package irvine.oeis.a352;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A352373 a(n) = [x^n] ( 1/((1 - x)^2*(1 - x^2)) )^n for n &gt;= 1.
 * a(n)=sum(k=0,n,(-1)^k*binom(4*n-k-1,n-k)*binom(n+k-1,k))
 * @author Georg Fischer
 */
public class A352373 extends LambdaSequence {

  /** Construct the sequence. */
  public A352373() {
    super(1, n -> Integers.SINGLETON.sum(0, n, k -> Z.NEG_ONE.pow(k).multiply(Binomial.binomial(4L * n - k - 1, n - k)).multiply(Binomial.binomial(n + k - 1, k))));
  }
}
