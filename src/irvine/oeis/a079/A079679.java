package irvine.oeis.a079;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A079679 a(n) = a(n,m) = Sum_{k=0..n} binomial(m*k,k)*binomial(m*(n-k),n-k) for m=6.
 * @author Georg Fischer
 */
public class A079679 extends LambdaSequence {

  /** Construct the sequence. */
  public A079679() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.FIVE.pow(n - k).multiply(Binomial.binomial(6L * n + 1, k))));
  }
}
