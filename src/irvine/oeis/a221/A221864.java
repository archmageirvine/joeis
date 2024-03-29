package irvine.oeis.a221;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A221864 Number of forests (sets) of rooted labeled trees on {1,2,...,n} such that the node with label 1 is in the same rooted tree as the node with label 2.
 * a(n)=sum(k=0,n-2,binom(n-2,k)*(k+2)^(k+1)*(n-k-1)^(n-k-3))
 * @author Georg Fischer
 */
public class A221864 extends LambdaSequence {

  /** Construct the sequence. */
  public A221864() {
    super(0, n -> Integers.SINGLETON.sum(0, n - 2, k -> Binomial.binomial(n - 2, k).multiply(Z.valueOf(k + 2).pow(k + 1)).multiply(Z.valueOf(n - k - 1).pow(n - k - 3))));
  }
}
