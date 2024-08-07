package irvine.oeis.a123;
// Generated by gen_seq4.pl 2024-01-04/lambdan at 2024-01-05 23:45

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A123747 Numerators of partial sums of a series for sqrt(5).
 * @author Georg Fischer
 */
public class A123747 extends LambdaSequence {

  /** Construct the sequence. */
  public A123747() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial(2L * k, k), Z.FIVE.pow(k))).num());
  }
}
