package irvine.oeis.a173;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A173194 a(n) = -sin^2 (2*n*arccos n) = - sin^2 (2*n*arcsin n).
 * @author Georg Fischer
 */
public class A173194 extends LambdaSequence {

  /** Construct the sequence. */
  public A173194() {
    super(0, n -> Z.valueOf((long) n * n - 1).multiply(n).multiply(n).multiply(Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(2L * n, 2L * k + 1).multiply(Z.valueOf((long) n * n - 1).pow(n - 1 - k)).multiply(Z.valueOf(n).pow(2L * k))).square()));
  }
}
