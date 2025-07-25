package irvine.oeis.a218;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A218150 a(n) = 5^((6+5*n+n^3)/6).
 * a(n)=5^(n*(n^2+5)/6+1)
 * @author Georg Fischer
 */
public class A218150 extends LambdaSequence {

  /** Construct the sequence. */
  public A218150() {
    super(-1, n -> (Z.FIVE).pow(Z.valueOf(n).multiply(Z.valueOf((long) n * n + 5)).divide(Z.SIX).add(Z.ONE)));
  }
}
