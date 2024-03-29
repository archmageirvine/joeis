package irvine.oeis.a344;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A344777 a(n) = Sum_{d|n} (-1)^(n/d-1) * binomial(d+n/d-1, d).
 * a(n) = sumdiv(n,d,(-1)^(n/d-1)*binom(d+n/d-1,d));
 * @author Georg Fischer
 */
public class A344777 extends LambdaSequence {

  /** Construct the sequence. */
  public A344777() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> (((n / d - 1 & 1) == 0) ? Z.ONE : Z.NEG_ONE).multiply(Binomial.binomial(d + n / d - 1, d))));
  }
}
