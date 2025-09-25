package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388682 Decimal expansion of (2^(3/8) * (2+sqrt(3))^(1/3) * Pi^(1/4) * exp(Pi / 12)) / sqrt(3 * (1+sqrt(3)) * Gamma(7/12) * Gamma(11/12)).
 * @author Sean A. Irvine
 */
public class A388682 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388682() {
    super(0, CR.PI.divide(12).exp().divide(12).multiply(CR.PI.pow(Q.ONE_QUARTER)).multiply(CR.TWO.pow(new Q(23, 24))).multiply(CR.THREE.sqrt()).multiply(CR.SQRT2.multiply(CR.THREE.sqrt().subtract(1)).sqrt()).multiply(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).sqrt()).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).sqrt()));
  }
}
