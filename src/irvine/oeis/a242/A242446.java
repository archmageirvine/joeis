package irvine.oeis.a242;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A242446 a(n) = Sum_{k=1..n} C(n,k) * k^(2*n).
 * a(n)=sum(k=1,n,binom(n,k)*k^(2*n))
 * @author Georg Fischer
 */
public class A242446 extends LambdaSequence {

  /** Construct the sequence. */
  public A242446() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Binomial.binomial(n, k).multiply(Z.valueOf(k).pow(2L * n))));
  }
}
