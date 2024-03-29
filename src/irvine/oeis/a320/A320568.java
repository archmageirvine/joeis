package irvine.oeis.a320;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A320568 a(n) = Sum_{k=1..n} (-1)^(n-k)*binomial(n,k)*sigma(k).
 * a(n)=sum(k=1, n, (-1)^(n-k)*binom(n, k)*sigma(k, 1))
 * @author Georg Fischer
 */
public class A320568 extends LambdaSequence {

  /** Construct the sequence. */
  public A320568() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> ((((n - k) & 1) == 0) ? Z.ONE : Z.NEG_ONE).multiply(Binomial.binomial(n, k)).multiply(Jaguar.factor(k).sigma(1))));
  }
}
