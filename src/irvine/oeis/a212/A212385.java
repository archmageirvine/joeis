package irvine.oeis.a212;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A212385 Number of Dyck n-paths all of whose ascents have lengths equal to 1 (mod 5).
 * @author Georg Fischer
 */
public class A212385 extends LambdaSequence {

  /** Construct the sequence. */
  public A212385() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(4L * k - 3L * n - 1, n - k).multiply(Binomial.binomial(n + 1, 5L * k - 4L * n))).divide(Z.valueOf(n + 1)));
  }
}
