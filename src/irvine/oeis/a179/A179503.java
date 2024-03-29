package irvine.oeis.a179;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A179503 a(n) = Sum_{k=0..n} C(n,k)*sigma(n,k)*sigma(n,n-k) for n&gt;0 with a(0)=1.
 * a(n) = sum(k=0,n,binom(n,k)*sigma(n,k)*sigma(n,n-k))
 * @author Georg Fischer
 */
public class A179503 extends LambdaSequence {

  /** Construct the sequence. */
  public A179503() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Jaguar.factor(n).sigma(k)).multiply(Jaguar.factor(n).sigma(n - k))));
  }
}
