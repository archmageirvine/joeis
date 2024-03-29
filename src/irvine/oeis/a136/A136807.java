package irvine.oeis.a136;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A136807 Hankel transform of double factorial numbers n!*2^n=A000165(n).
 * a(n)=prod(k=1,n,(2*k)^(2(n-k+1)))
 * @author Georg Fischer
 */
public class A136807 extends LambdaSequence {

  /** Construct the sequence. */
  public A136807() {
    super(0, n -> Integers.SINGLETON.product(1, n, k -> Z.valueOf(2L * k).pow(Z.TWO.multiply(Z.valueOf(n - k + 1)))));
  }
}
