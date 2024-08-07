package irvine.oeis.a130;
// Generated by gen_seq4.pl 2024-01-04/lambdan at 2024-01-05 23:45

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A130551 Numerators of partial sums for a series of (4/5)*Zeta(3).
 * @author Georg Fischer
 */
public class A130551 extends LambdaSequence {

  /** Construct the sequence. */
  public A130551() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, j -> new Q(Z.NEG_ONE.pow(j - 1), Z.valueOf(j).pow(3).multiply(Binomial.binomial(2L * j, j)))).multiply(Z.TWO).num());
  }
}
