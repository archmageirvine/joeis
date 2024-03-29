package irvine.oeis.a245;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A245054 Number of hybrid (n+1)-ary trees with n internal nodes.
 * a(n)=sum(i=0, n, binom(n^2+i, i)*binom(n^2+i+1, n-i))/(n^2+1)
 * @author Georg Fischer
 */
public class A245054 extends LambdaSequence {

  /** Construct the sequence. */
  public A245054() {
    super(0, n -> Integers.SINGLETON.sum(0, n, i -> Binomial.binomial((long) n * n + i, i).multiply(Binomial.binomial((long) n * n + i + 1, n - i))).divide(Z.valueOf((long) n * n + 1)));
  }
}
