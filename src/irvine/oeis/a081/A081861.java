package irvine.oeis.a081;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A081861 a(n) = (1/24)*(sigma_3(2*n-1) - sigma_1(2*n-1)).
 * a(n)=(sigma(2*n-1,3)-sigma(2*n-1,1))/24
 * @author Georg Fischer
 */
public class A081861 extends LambdaSequence {

  /** Construct the sequence. */
  public A081861() {
    super(1, n -> Jaguar.factor(2L * n - 1).sigma(3).subtract(Jaguar.factor(2L * n - 1).sigma(1)).divide(Z.valueOf(24)));
  }
}
