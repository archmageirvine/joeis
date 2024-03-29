package irvine.oeis.a343;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A343545 a(n) = n * Sum_{d|n} binomial(d+3,4)/d.
 * @author Georg Fischer
 */
public class A343545 extends LambdaSequence {

  /** Construct the sequence. */
  public A343545() {
    super(1, n -> Rationals.SINGLETON.sumdiv(n, d -> new Q(Binomial.binomial(d + 3, 4), Z.valueOf(d))).multiply(n).num());
  }
}
