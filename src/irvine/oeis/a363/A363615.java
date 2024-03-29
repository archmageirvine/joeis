package irvine.oeis.a363;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A363615 Expansion of Sum_{k&gt;0} x^(3*k)/(1+x^k)^3.
 * a(n) = -sumdiv(n,d,(-1)^d*binom(d-1,2));
 * @author Georg Fischer
 */
public class A363615 extends LambdaSequence {

  /** Construct the sequence. */
  public A363615() {
    super(1, n -> Z.ZERO.subtract(Integers.SINGLETON.sumdiv(n, d -> Z.NEG_ONE.pow(d).multiply(Binomial.binomial(d - 1, 2)))));
  }
}
