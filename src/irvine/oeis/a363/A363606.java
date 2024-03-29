package irvine.oeis.a363;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A363606 Expansion of Sum_{k&gt;0} x^(2*k)/(1-x^k)^6.
 * a(n)=sumdiv(n,d,binom(d+3,5))
 * @author Georg Fischer
 */
public class A363606 extends LambdaSequence {

  /** Construct the sequence. */
  public A363606() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Binomial.binomial(d + 3, 5)));
  }
}
