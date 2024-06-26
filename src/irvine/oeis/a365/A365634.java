package irvine.oeis.a365;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A365634 The number of divisors of n that are terms of A048102.
 * Multiplicative with: a(p^e) = 1 + [e == p], where [] is the Iverson bracket.
 * @author Georg Fischer
 */
public class A365634 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A365634() {
    super(1, (p, e) -> Z.valueOf(1 + (p.equals(e.longValue()) ? 1 : 0)));
  }
}
