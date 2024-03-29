package irvine.oeis.a356;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A356858 a(n) is the product of the first n numbers not divisible by 5.
 * a(n)=prod(k=1,n,floor((5*k-1)/4))
 * @author Georg Fischer
 */
public class A356858 extends LambdaSequence {

  /** Construct the sequence. */
  public A356858() {
    super(0, n -> Integers.SINGLETON.product(1, n, k -> Z.valueOf(5L * k - 1).divide(Z.FOUR)));
  }
}
