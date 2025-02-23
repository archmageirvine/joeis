package irvine.oeis.a206;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A206764 a(n) = Sum_{k=1..n} binomial(n,k) * sigma(n,k) * (-1)^(n-k).
 * a(n) = sum(k=1,n,binom(n,k) * sigma(n,k) * (-1)^(n-k))
 * @author Georg Fischer
 */
public class A206764 extends LambdaSequence {

  /** Construct the sequence. */
  public A206764() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Binomial.binomial(n, k).multiply(Jaguar.factor(n).sigma(k)).multiply(Z.NEG_ONE.pow(n - k))));
  }
}
