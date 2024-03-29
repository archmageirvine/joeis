package irvine.oeis.a276;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A276129 a(n) is the number of ordered ways to tile a strip of length n+2 with white tiles of odd lengths summing to length n and two red squares.
 * a(n)=sum(k=0,floor((n-1)/2),binom(n-2*k+2,2)*binom(n-k-1,k)))
 * @author Georg Fischer
 */
public class A276129 extends LambdaSequence {

  /** Construct the sequence. */
  public A276129() {
    super(0, n -> Integers.SINGLETON.sum(0, (n - 1) / 2, k -> Binomial.binomial(n - 2L * k + 2, 2).multiply(Binomial.binomial(n - k - 1, k))));
  }
}
