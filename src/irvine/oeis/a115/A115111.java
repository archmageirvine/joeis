package irvine.oeis.a115;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A115111 Number of different ways to select n elements from four sets of n elements under the precondition of choosing at least one element from each set.
 * a(n) = binom(4*n,n)-4*(binom(3*n,n)+1)+6*binom(2*n,n); also: a(n)=sumbinom(n,i)*binom(n,j)*binom(n,k)*binom(n,l)|i,j,k,l=1...(n-3),i+j+k+l=n.
 * @author Georg Fischer
 */
public class A115111 extends LambdaSequence {

  /** Construct the sequence. */
  public A115111() {
    super(1, n -> Binomial.binomial(4L * n, n).subtract(Z.FOUR.multiply(Binomial.binomial(3L * n, n).add(Z.ONE))).add(Z.SIX.multiply(Binomial.binomial(2L * n, n))));
  }
}
