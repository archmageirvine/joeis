package irvine.oeis.a276;
// Generated by gen_seq4.pl 2024-02-07/lambdan at 2024-02-07 14:25

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A276653 a(n) = floor(Sum_{p|n} 0.p) where p runs through the prime divisors of n&gt;1.
 * @author Georg Fischer
 */
public class A276653 extends LambdaSequence {

  /** Construct the sequence. */
  public A276653() {
    super(2, n -> Rationals.SINGLETON.sopf(n, p -> new Q(p, Z.TEN.pow(String.valueOf(p).length()))).floor());
  }
}
