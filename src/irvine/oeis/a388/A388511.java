package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388511 Decimal expansion of (-4*2^(5/6) * (1+sqrt(2)) * (3+sqrt(3)) * sqrt(Gamma(5/6)) * Gamma(5/4) * sin(Pi / 8)) / (Pi^(3/4) * Gamma(-1/12)).
 * @author Sean A. Irvine
 */
public class A388511 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388511() {
    super(1, CR.TWO.pow(new Q(1, 12)).divide(12).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(5, 6)).sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(5, 8))).multiply(CR.ONE.add(CR.THREE.sqrt())).multiply(CR.ONE.add(CR.SQRT2)).divide(CR.PI.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(7, 8))).divide(CrFunctions.GAMMA.cr(new Q(11, 12))));
  }
}
