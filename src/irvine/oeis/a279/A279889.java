package irvine.oeis.a279;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 11:10

import irvine.factor.factor.Jaguar;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A279889 a(n) = Sum_{k=1..n-1} sigma_5(k)*sigma_5(n-k).
 * a(n) = sum(k=1,n-1,sigma(k,5)*sigma(n-k,5))
 * @author Georg Fischer
 */
public class A279889 extends LambdaSequence {

  /** Construct the sequence. */
  public A279889() {
    super(1, n -> Integers.SINGLETON.sum(1, n - 1, k -> Jaguar.factor(k).sigma(5).multiply(Jaguar.factor(n - k).sigma(5))));
  }
}
