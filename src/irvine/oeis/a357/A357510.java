package irvine.oeis.a357;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 11:10

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A357510 a(n) = Sum_{k = 0..n} k * binomial(n,k)^2 * binomial(n+k,k)^2.
 * a(n) = sum(k = 0,n,k * binom(n,k)^2 * binom(n+k,k)^2);
 * @author Georg Fischer
 */
public class A357510 extends LambdaSequence {

  /** Construct the sequence. */
  public A357510() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf(k).multiply(Binomial.binomial(n, k).square()).multiply(Binomial.binomial(n + k, k).square())));
  }
}
