package irvine.oeis.a099;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A099237 a(n) = Sum_{k=0..n} binomial(n*(n-k), k).
 * a(n)=sum(k=0, n, binom(n*(n-k), k))
 * @author Georg Fischer
 */
public class A099237 extends LambdaSequence {

  /** Construct the sequence. */
  public A099237() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial((long) n * (n - k), k)));
  }
}
