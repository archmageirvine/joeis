package irvine.oeis.a217;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A217994 a(n) = 2^((2 + n + n^2)/2).
 * a(n)=2^((2+n+n^2)/2)
 * @author Georg Fischer
 */
public class A217994 extends LambdaSequence {

  /** Construct the sequence. */
  public A217994() {
    super(0, n -> Z.TWO.pow(Z.valueOf(2 + n + (long) n * n).divide2()));
  }
}
