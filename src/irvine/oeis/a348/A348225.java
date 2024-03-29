package irvine.oeis.a348;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A348225 a(n) = Sum_{d|n} binomial(n,d)^d.
 * a(n) = sumdiv(n,d,binom(n,d)^d);
 * @author Georg Fischer
 */
public class A348225 extends LambdaSequence {

  /** Construct the sequence. */
  public A348225() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Binomial.binomial(n, d).pow(d)));
  }
}
