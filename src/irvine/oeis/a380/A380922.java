package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-05-29.ack/mulr at 2025-05-29 22:38

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A380922 Dirichlet g.f.: zeta(s) * Product_{p prime} (1 + 1/p^s + 1/p^(3*s)).
 * Multiplicative with: 2 if e <= 2 and 3 otherwise
 * @author Georg Fischer
 */
public class A380922 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A380922() {
    super(1, (p, e) -> e <= 2 ? Z.TWO : Z.THREE);
  }
}
