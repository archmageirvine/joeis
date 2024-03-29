package irvine.oeis.a344;
// Generated by gen_seq4.pl 2024-01-23/lambdan at 2024-01-25 00:21

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A344042 a(n) = n * Sum_{d|n} sigma(d)^2 / d.
 * @author Georg Fischer
 */
public class A344042 extends LambdaSequence {

  /** Construct the sequence. */
  public A344042() {
    super(1, n -> Rationals.SINGLETON.sumdiv(n, d -> new Q(Jaguar.factor(d).sigma().square(), Z.valueOf(d))).multiply(n).num());
  }
}
