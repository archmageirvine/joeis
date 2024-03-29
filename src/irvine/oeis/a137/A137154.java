package irvine.oeis.a137;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-26 21:16

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A137154 a(n) = Sum_{k=0..n} binomial(2^k + n-k-1, n-k); equals the row sums of triangle A137153.
 * a(n)=sum(k=0,n,binom(2^k+n-k-1,n-k))
 * @author Georg Fischer
 */
public class A137154 extends LambdaSequence {

  /** Construct the sequence. */
  public A137154() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(Z.ONE.shiftLeft(k).add(n - k - 1), n - k)));
  }
}
