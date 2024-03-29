package irvine.oeis.a326;
// Generated by gen_seq4.pl mult at 2022-07-21 21:19

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A326815 Dirichlet g.f.: zeta(s)^3 * Product_{p prime} (1 - 2 * p^(-s)).
 * @author Georg Fischer
 */
public class A326815 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A326815() {
    super(1, (p, e) -> Z.valueOf(e + 1).multiply(2 - e).divide2());
  }
}
