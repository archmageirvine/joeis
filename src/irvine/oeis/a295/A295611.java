package irvine.oeis.a295;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A295611 a(n) = Sum_{k=0..n} (-1)^k*binomial(n,k)^k.
 * a(n) = sum(k=0,n,(-1)^k*binom(n,k)^k);
 * @author Georg Fischer
 */
public class A295611 extends LambdaSequence {

  /** Construct the sequence. */
  public A295611() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.NEG_ONE.pow(k).multiply(Binomial.binomial(n, k).pow(k))));
  }
}
