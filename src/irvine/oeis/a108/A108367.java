package irvine.oeis.a108;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A108367 L(n,-n), where L is defined as in A108299.
 * a(n) = sum(k=0,n,(-1)^k*binom(n+k,2*k)*(n+2)^k);
 * @author Georg Fischer
 */
public class A108367 extends LambdaSequence {

  /** Construct the sequence. */
  public A108367() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.NEG_ONE.pow(k).multiply(Binomial.binomial(n + k, 2L * k)).multiply(Z.valueOf(n + 2).pow(k))));
  }
}
