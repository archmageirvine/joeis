package irvine.oeis.a357;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A357825 Total number of n-tuples of semi-Dyck paths from (0,0) to (n,n-2*j) for j = 0..floor(n/2).
 * a(n)=sum(k=0,n/2,(binom(n,k)*(n-2*k+1)/(n-k+1))^n)
 * @author Georg Fischer
 */
public class A357825 extends LambdaSequence {

  /** Construct the sequence. */
  public A357825() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 2, k -> Binomial.binomial(n, k).multiply(Z.valueOf(n - 2L * k + 1)).divide(Z.valueOf(n - k + 1)).pow(n)));
  }
}
