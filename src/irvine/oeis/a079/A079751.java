package irvine.oeis.a079;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A079751 Operation count to create all permutations of n distinct elements using the "streamlined" version of Algorithm L (lexicographic permutation generation) from Knuth's The Art of Computer Programming, Vol. 4, chapter 7.2.1.2. Sequence gives number of cases where the j search loop runs beyond j=n-3.
 * a(n)=sum(j=4,n,(n-j)! * binom(n,j))
 * @author Georg Fischer
 */
public class A079751 extends LambdaSequence {

  /** Construct the sequence. */
  public A079751() {
    super(3, n -> Integers.SINGLETON.sum(4, n, j -> Functions.FACTORIAL.z(n - j).multiply(Binomial.binomial(n, j))));
  }
}
