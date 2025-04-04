package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-09.ack/lambdan at 2025-03-09 21:42

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A381775 Expansion of ( (1/x) * Series_Reversion( x/((1+x) * C(x))^6 ) )^(1/6), where C(x) is the g.f. of A000108.
 * @author Georg Fischer
 */
public class A381775 extends LambdaSequence {

  /** Construct the sequence. */
  public A381775() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial(6 * n + 2 * k + 1, k).multiply(Binomial.binomial(6 * n + 1, n - k)), Z.valueOf(6 * n + 2 * k + 1))).num());
  }
}
