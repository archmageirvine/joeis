package irvine.oeis.a306;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A306292 Number of asymmetric Dyck paths of semilength n.
 * @author Georg Fischer
 */
public class A306292 extends LambdaSequence {

  /** Construct the sequence. */
  public A306292() {
    super(1, n -> Binomial.binomial(2L * n, n).divide(Z.valueOf(n + 1)).subtract(Binomial.binomial(n, n / 2)));
  }
}
