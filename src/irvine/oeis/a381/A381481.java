package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-05-29.ack/mulr at 2025-05-29 22:38

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A381481 Dirichlet g.f.: zeta(s) * Product_{p prime} (1 - 1/p^(2*s) - 1/p^(3*s)).
 * Multiplicative with: 1 if e = 1, 0 if e = 2, and -1 otherwise.- _Amiram Eldar_, Apr 22 2025
 * @author Georg Fischer
 */
public class A381481 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A381481() {
    super(1, (p, e) -> e == 1 ? Z.ONE : (e == 2 ? Z.ZERO : Z.NEG_ONE));
  }
}
