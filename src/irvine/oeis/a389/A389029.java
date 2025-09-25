package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389029 Decimal expansion of (Pi^(5/3) * exp(Pi) * Gamma(7/12)^(11/2) * Gamma(11/12)^(47/6)) / (4*2^(1/6) * 3^(1/24) * ((1+sqrt(3)) * Gamma(2/3))^(7/3) * Gamma(3/4)^(46/3)).
 * @author Sean A. Irvine
 */
public class A389029 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389029() {
    super(1, CR.PI.exp().multiply(new Q(1024, 3)).multiply(CR.PI.pow(new Q(5, 3))).multiply(CR.THREE.pow(new Q(23, 24))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(47, 6))).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(7, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(46, 3))).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(47, 6))).divide(CR.SQRT2.multiply(CR.THREE.sqrt().subtract(1)).pow(new Q(11, 2))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(new Q(11, 2))));
  }
}
