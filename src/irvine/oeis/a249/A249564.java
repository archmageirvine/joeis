package irvine.oeis.a249;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A249564 a(n) = Sum_{k = 0..n} (k*(k+1)/2)^n.
 * a(n) = sum(k=0,n,(k*(k+1)/2)^n)
 * @author Georg Fischer
 */
public class A249564 extends LambdaSequence {

  /** Construct the sequence. */
  public A249564() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf(k).multiply(Z.valueOf(k + 1)).divide2().pow(n)));
  }
}
