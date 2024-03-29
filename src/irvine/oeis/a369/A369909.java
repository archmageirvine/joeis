package irvine.oeis.a369;
// Generated by gen_seq4.pl 2024-02-07/lambdan at 2024-02-07 14:25

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A369909 a(n) = n * Sum_{p|n, p prime} Omega(n/p) / p.
 * @author Georg Fischer
 */
public class A369909 extends LambdaSequence {

  /** Construct the sequence. */
  public A369909() {
    super(1, n -> Rationals.SINGLETON.sopf(n, p -> new Q(Z.valueOf(Jaguar.factor(n / p).bigOmega()), Z.valueOf(p))).multiply(Z.valueOf(n)).num());
  }
}
