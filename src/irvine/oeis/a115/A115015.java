package irvine.oeis.a115;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A115015 Sum_{i=1..n} (gcd(7,i)=1) i.
 * a(n)=binom(n+1,2)-7*binom(n\7+1,2)
 * @author Georg Fischer
 */
public class A115015 extends LambdaSequence {

  /** Construct the sequence. */
  public A115015() {
    super(1, n -> Binomial.binomial(n + 1, 2).subtract(Z.SEVEN.multiply(Binomial.binomial(n / 7 + 1, 2))));
  }
}
