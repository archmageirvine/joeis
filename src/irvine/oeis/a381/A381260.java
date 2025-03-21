package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-02-22.ack/lambdan at 2025-02-22 21:47

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A381260 Expansion of e.g.f. exp( -LambertW(-2 * x * cosh(x)) / 2 ).
 * @author Georg Fischer
 */
public class A381260 extends LambdaSequence {

  /** Construct the sequence. */
  public A381260() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(2L * k + 1).pow(k - 1).multiply(Integers.SINGLETON.sum(0, k, j -> Z.valueOf(2L * j - k).pow(n - k).multiply(Binomial.binomial(k, j))).multiply(Binomial.binomial(n, k)).divide(Z.TWO.pow(k)))).num());
  }
}
