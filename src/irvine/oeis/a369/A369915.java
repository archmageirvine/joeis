package irvine.oeis.a369;
// Generated by gen_seq4.pl 2024-02-07/lambdan at 2024-02-07 14:25

import irvine.math.IntegerUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A369915 a(n) = Sum_{p|n, p prime} lcm(p, n/p) / p.
 * @author Georg Fischer
 */
public class A369915 extends LambdaSequence {

  /** Construct the sequence. */
  public A369915() {
    super(1, n -> Rationals.SINGLETON.sopf(n, p -> new Q(Z.valueOf(IntegerUtils.lcm(p, n / p)), Z.valueOf(p))).num());
  }
}
