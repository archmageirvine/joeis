package irvine.oeis.a374;
// Generated by gen_seq4.pl 2025-03-09.ack/lambdan at 2025-03-09 21:42

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A374836 Number of ternary paths of length 3*n having exactly 2 hills.
 * @author Georg Fischer
 */
public class A374836 extends LambdaSequence {

  /** Construct the sequence. */
  public A374836() {
    super(0, n -> Rationals.SINGLETON.sum(0, n - 2, k -> new Q(Z.NEG_ONE.pow(k).multiply(k + 1).multiply(k + 2).multiply(k + 3), Z.valueOf(2 * (2 * n - 1 - k))).multiply(Binomial.binomial(3 * n - 4 - 2 * k, n - 2 - k))).num());
  }
}
