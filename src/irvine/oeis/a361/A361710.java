package irvine.oeis.a361;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A361710 a(n) = Sum_{k = 0..n-1} (-1)^k*binomial(n,k)*binomial(n-1,k)^2.
 * a(n) = sum(k = 0,n-1,(-1)^k*binom(n,k)*binom(n-1,k)^2);
 * @author Georg Fischer
 */
public class A361710 extends LambdaSequence {

  /** Construct the sequence. */
  public A361710() {
    super(0, n -> Integers.SINGLETON.sum(0, n - 1, k -> Z.NEG_ONE.pow(k).multiply(Binomial.binomial(n, k)).multiply(Binomial.binomial(n - 1, k).square())));
  }
}
