package irvine.oeis.a180;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A180350 G.f.: Sum_{n&gt;=0} a(n)*x^n/n!^5 = [ Sum_{n&gt;=0} x^n/n!^5 ]^3.
 * a(n)=sum(k=0,n,binom(n,k)^5*sum(j=0,k,binom(k,j)^5))
 * @author Georg Fischer
 */
public class A180350 extends LambdaSequence {

  /** Construct the sequence. */
  public A180350() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).pow(Z.FIVE).multiply(Integers.SINGLETON.sum(0, k, j -> Binomial.binomial(k, j).pow(Z.FIVE)))));
  }
}
