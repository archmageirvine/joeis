package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388932 Decimal expansion of exp(Pi / 8) * 3^(5/32) * 2^(13/16) * Gamma(5/8)^(5/4) * Gamma(11/12)^(5/8) * Gamma(7/12)^(5/8) / (sqrt(2) * (2-sqrt(2))^(1/2))^(3/4) / (sqrt(2) * (2+sqrt(2))^(1/2))^(1/2) * (2+sqrt(2))^(1/4) / (sqrt(2) * (1+3^(1/2)))^(5/8) / (sqrt(2) * (3^(1/2)-1))^(5/8) / Pi^(5/8) / Gamma(7/8)^(5/4).
 * @author Sean A. Irvine
 */
public class A388932 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388932() {
    super(0, CR.PI.divide(8).exp().multiply(CR.THREE.pow(new Q(5, 32))).multiply(CR.TWO.pow(new Q(13, 16))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(new Q(5, 4))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(5, 8))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(new Q(5, 8))).divide(CR.SQRT2.multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).pow(new Q(3, 4))).divide(CR.SQRT2.multiply(CR.TWO.add(CR.SQRT2).sqrt()).sqrt()).multiply(CR.TWO.add(CR.SQRT2).pow(Q.ONE_QUARTER)).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(5, 8))).divide(CR.SQRT2.multiply(CR.THREE.sqrt().subtract(1)).pow(new Q(5, 8))).divide(CR.PI.pow(new Q(5, 8))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(new Q(5, 4))));
  }
}
