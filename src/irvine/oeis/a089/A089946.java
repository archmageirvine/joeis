package irvine.oeis.a089;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A089946 Secondary diagonal of array A089944, in which the n-th row is the n-th binomial transform of the natural numbers.
 * a(n)=sum(k=0,n,binom(n,k) * (n-k+1)^(n-k-1) * (2*k+1) * (k+1)^(k-1))
 * @author Georg Fischer
 */
public class A089946 extends LambdaSequence {

  /** Construct the sequence. */
  public A089946() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Z.valueOf(n - k + 1).pow(n - k - 1)).multiply(Z.valueOf(2L * k + 1)).multiply(Z.valueOf(k + 1).pow(k - 1))));
  }
}
