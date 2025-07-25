package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-15.ack/decexp at 2025-07-15 23:51

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A385961 Decimal expansion of the value of the coefficient [x^3] Gamma(x).
 * Formula: Equals(gamma^4 +6*gamma^2*zeta(2) +8*gamma*zeta(3) +3*zeta(2)^2 +6*zeta(4))/24
 * @author Georg Fischer
 */
public class A385961 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A385961() {
    super(0, CR.GAMMA.pow(4).add(CR.GAMMA.square().multiply(Zeta.zeta(2)).multiply(6)).add(CR.GAMMA.multiply(Zeta.zeta(3)).multiply(8)).add(Zeta.zeta(2).square().multiply(3)).add(Zeta.zeta(4).multiply(6)).divide(24));
  }
}
