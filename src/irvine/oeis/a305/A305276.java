package irvine.oeis.a305;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A305276 Expansion of e.g.f. 1/(1 + LambertW(-x/(1 - x))).
 * a(n)=sum(k=0,n,binom(n-1,k-1)*k^k*n!/k!)
 * @author Georg Fischer
 */
public class A305276 extends LambdaSequence {

  /** Construct the sequence. */
  public A305276() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n - 1, k - 1).multiply(Z.valueOf(k).pow(k)).multiply(Functions.FACTORIAL.z(n)).divide(Functions.FACTORIAL.z(k))));
  }
}
