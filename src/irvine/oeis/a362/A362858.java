package irvine.oeis.a362;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A362858 Expansion of e.g.f. exp(-3*x) / (1 + LambertW(-x)).
 * a(n)=sum(k=0,n,(-3)^(n-k) * k^k * binom(n,k))
 * @author Georg Fischer
 */
public class A362858 extends LambdaSequence {

  /** Construct the sequence. */
  public A362858() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf(-3).pow(n - k).multiply(Z.valueOf(k).pow(k)).multiply(Binomial.binomial(n, k))));
  }
}
