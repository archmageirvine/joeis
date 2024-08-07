package irvine.oeis.a245;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A245053 Number of hybrid 10-ary trees with n internal nodes.
 * a(n) = 1/(9*n+1) * sum(i=0,n,binom(9*n+i,i)*binom(9*n+i+1,n-i))
 * @author Georg Fischer
 */
public class A245053 extends LambdaSequence {

  /** Construct the sequence. */
  public A245053() {
    super(0, n -> Integers.SINGLETON.sum(0, n, i -> Binomial.binomial(9L * n + i, i).multiply(Binomial.binomial(9L * n + i + 1, n - i))).divide(9L * n + 1));
  }
}
