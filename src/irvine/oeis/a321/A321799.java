package irvine.oeis.a321;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A321799 G.f. satisfies: A(x) = 1/(1 - x/(1 - x*A(x))^5).
 * @author Georg Fischer
 */
public class A321799 extends LambdaSequence {

  /** Construct the sequence. */
  public A321799() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Binomial.binomial(n + 4L * k - 1, n - k)).divide(Z.valueOf(n - k + 1))));
  }
}
