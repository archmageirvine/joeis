package irvine.oeis.a350;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A350107 a(n) = Sum_{k=1..n} k * floor(n/k)^2.
 * a(n) = sum(k=1,n,k * floor(n/k)^2)
 * @author Georg Fischer
 */
public class A350107 extends LambdaSequence {

  /** Construct the sequence. */
  public A350107() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Z.valueOf(k).multiply(Z.valueOf(n / k).square())));
  }
}
