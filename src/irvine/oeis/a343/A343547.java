package irvine.oeis.a343;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A343547 a(n) = n * Sum_{d|n} binomial(d+n-2,n-1)/d.
 * a(n) = n*sumdiv(n,d,binom(d+n-2,n-1)/d);
 * @author Georg Fischer
 */
public class A343547 extends LambdaSequence {

  /** Construct the sequence. */
  public A343547() {
    super(1, n -> Z.valueOf(n).multiply(Integers.SINGLETON.sumdiv(n, d -> Binomial.binomial(d + n - 2, n - 1).divide(d))));
  }
}
