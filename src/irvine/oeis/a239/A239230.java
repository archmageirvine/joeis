package irvine.oeis.a239;
// Generated by gen_seq4.pl 2024-12-04.ack/lambdan at 2024-12-04 00:03

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A239230 Expansion of -x*log'(-sqrt(12*x+2*sqrt(1-4*x)+2)/4+sqrt(1-4*x)/4+5/4).
 * @author Georg Fischer
 */
public class A239230 extends LambdaSequence {

  /** Construct the sequence. */
  public A239230() {
    super(0, n -> Rationals.SINGLETON.sum(1, n, k -> Rationals.SINGLETON.sum(0, n - k, j -> new Q(Binomial.binomial(n + 2L * j - 1, j + n - 1).multiply(Z.NEG_ONE.pow(k + j + n)).multiply(Binomial.binomial(2L * n - k, j + n)), 2L * n - k))).multiply(n).num());
  }
}
