package irvine.oeis.a343;
// Generated by gen_seq4.pl 2023-09-20/lambda at 2023-09-21 01:53

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A343259 a(n) = 2 * T(n,n/2) where T(n,x) is a Chebyshev polynomial of the first kind.
 * @author Georg Fischer
 */
public class A343259 extends LambdaSequence {

  /** Construct the sequence. */
  public A343259() {
    super(0, n -> n == 0 ? Z.TWO : Rationals.SINGLETON.sum(0, n, k -> new Q(Z.valueOf(n - 2).pow(k).multiply(Binomial.binomial(n + k, 2L * k)), Z.valueOf(n + k))).multiply(2L * n).num());
  }
}
