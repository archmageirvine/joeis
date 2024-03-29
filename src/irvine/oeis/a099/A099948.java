package irvine.oeis.a099;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.oeis.LambdaSequence;

/**
 * A099948 Number of partitions of n such that the number of blocks is congruent to 3 mod 4.
 * a(n)=sum(k=0,(n-3)/4,stirl2(n,3+4*k))
 * @author Georg Fischer
 */
public class A099948 extends LambdaSequence {

  /** Construct the sequence. */
  public A099948() {
    super(3, n -> Integers.SINGLETON.sum(0, (n - 3) / 4, k -> Stirling.secondKind(n, 3 + 4L * k)));
  }
}
