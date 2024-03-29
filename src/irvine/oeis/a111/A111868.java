package irvine.oeis.a111;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A111868 The work performed by a function f:{1,...,n} -&gt; {1,...,n} is defined to be work(f) = Sum_{i=1..n} |i - f(i)|; a(n) is equal to sum(work(f)) where the sum is over all functions f:{1,...,n}-&gt;{1,...,n}.
 * a(n)=n^n*(n^2-1)/3
 * @author Georg Fischer
 */
public class A111868 extends LambdaSequence {

  /** Construct the sequence. */
  public A111868() {
    super(1, n -> Z.valueOf(n).pow(n).multiply(Z.valueOf((long) n * n - 1)).divide(Z.THREE));
  }
}
