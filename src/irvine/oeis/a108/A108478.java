package irvine.oeis.a108;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A108478 Diagonal sums of number triangle A108477.
 * a(n) = sum(k=0,n\2,sum(j=0,n-k,binom(2*(n-2*k),j)*binom(2*k,j)*2^j));
 * @author Georg Fischer
 */
public class A108478 extends LambdaSequence {

  /** Construct the sequence. */
  public A108478() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 2, k -> Integers.SINGLETON.sum(0, n - k, j -> Binomial.binomial(2 * (n - 2L * k), j).multiply(Binomial.binomial(2L * k, j)).multiply(Z.ONE.shiftLeft(j)))));
  }
}
