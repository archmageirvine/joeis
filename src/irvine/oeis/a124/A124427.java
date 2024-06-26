package irvine.oeis.a124;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A124427 Sum of the sizes of the blocks containing the element 1 in all set partitions of {1,2,...,n}.
 * a(n)=sum(k=1, n, binom(n-1, k-1)*bell(n-k)*k)
 * @author Georg Fischer
 */
public class A124427 extends LambdaSequence {

  /** Construct the sequence. */
  public A124427() {
    super(0, n -> Integers.SINGLETON.sum(1, n, k -> Binomial.binomial(n - 1, k - 1).multiply(Functions.BELL.z(n - k)).multiply(k)));
  }
}
