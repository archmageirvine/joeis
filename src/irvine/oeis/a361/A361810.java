package irvine.oeis.a361;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A361810 a(n) is the sum of divisors of n that are both infinitary and exponential.
 * Multiplicative with: a(p^e) = Sum_{d|e, bitor(d, e) == e} p^d.
 * @author Georg Fischer
 */
public class A361810 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A361810() {
    super(1, (p, e) -> Integers.SINGLETON.sumdiv(e, d -> ((d | e) == e) ? p.pow(d) : Z.ZERO));
  }
}
