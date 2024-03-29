package irvine.oeis.a081;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A081301 Subdiagonal of square array A081297.
 * a(n)=((n+2)^(n+1)-(-(n+1))^(n+1))/(2*n+3)
 * @author Georg Fischer
 */
public class A081301 extends LambdaSequence {

  /** Construct the sequence. */
  public A081301() {
    super(0, n -> Z.valueOf(n + 2).pow(n + 1).subtract(Z.valueOf(n + 1).negate().pow(Z.valueOf(n + 1))).divide(Z.valueOf(2L * n + 3)));
  }
}
