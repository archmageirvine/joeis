package irvine.oeis.a306;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A306843 a(n) = Sum_{d|n} binomial(n,d)^3.
 * a(n) = sumdiv(n,d,binom(n,d)^3)
 * @author Georg Fischer
 */
public class A306843 extends LambdaSequence {

  /** Construct the sequence. */
  public A306843() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Binomial.binomial(n, d).pow(Z.THREE)));
  }
}
