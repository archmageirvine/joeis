package irvine.oeis.a365;
// Generated by gen_seq4.pl multman/mult at 2023-10-02 19:24

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A365498 Dirichlet g.f.: zeta(s) * Product_{p prime} (1 + 1/p^s - 1/p^(3*s)).
 * Multiplicative with: a(p^e) = 2 if e <= 2, and 1 otherwise.
 * @author Georg Fischer
 */
public class A365498 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A365498() {
    super(1, (p, e) -> Z.valueOf(e <= 2 ? 2 : 1));
  }
}
