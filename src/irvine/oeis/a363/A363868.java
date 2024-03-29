package irvine.oeis.a363;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A363868 a(n) = A108625(3*n, n).
 * a(n)=sum(k=0,n,(-1)^(n+k) * binom(3*n,n-k)*binom(3*n+k,k)^2)
 * @author Georg Fischer
 */
public class A363868 extends LambdaSequence {

  /** Construct the sequence. */
  public A363868() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.NEG_ONE.pow(n + k).multiply(Binomial.binomial(3L * n, n - k)).multiply(Binomial.binomial(3L * n + k, k).square())));
  }
}
