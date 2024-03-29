package irvine.oeis.a133;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A133990 a(n) = Sum_{k=0..n} (-1)^(n-k) * binomial(n,k) * binomial(2^k + n - 1,n).
 * a(n)=sum(k=0,n,(-1)^(n-k)*binom(n,k)*binom(2^k+n-1,n))
 * @author Georg Fischer
 */
public class A133990 extends LambdaSequence {

  /** Construct the sequence. */
  public A133990() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.NEG_ONE.pow(n - k).multiply(Binomial.binomial(n, k)).multiply(Binomial.binomial(Z.ONE.shiftLeft(k).add(Z.valueOf(n).subtract(1)), n))));
  }
}
