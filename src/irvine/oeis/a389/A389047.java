package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389047 Decimal expansion of (1/128) * 2^(3/4) * Gamma(2/3) * Gamma(5/8)^5 * Gamma(7/12) * (2+sqrt(2))^3 * (1+3^(1/2)) / Gamma(7/8)^5 / Pi^2.
 * @author Sean A. Irvine
 */
public class A389047 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389047() {
    super(1, CR.TWO.pow(new Q(3, 4)).divide(128).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(5)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).multiply(CR.TWO.add(CR.SQRT2).pow(3)).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(5)).divide(CR.PI.square()));
  }
}
