package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388641 Decimal expansion of (1/450359962737049600000) * exp(Pi) * 5^(1/4) * Pi * Gamma(4/5)^34*2^(3/5) * (5-5^(1/2))^14 * (5+5^(1/2))^3 * (5^(1/2)-1)^17 * (5^(1/2)+1)^17 / Gamma(3/4)^4 / Gamma(7/10)^17 / Gamma(9/10)^17.
 * @author Sean A. Irvine
 */
public class A388641 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388641() {
    super(1, CR.PI.exp().divide(new Z("450359962737049600000")).multiply(CR.FIVE.pow(Q.ONE_QUARTER)).multiply(CR.PI).multiply(CrFunctions.GAMMA.cr(new Q(4, 5)).pow(34)).multiply(CR.TWO.pow(new Q(3, 5))).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).pow(14)).multiply(CR.FIVE.add(CR.FIVE.sqrt()).pow(3)).multiply(CR.FIVE.sqrt().subtract(1).pow(17)).multiply(CR.FIVE.sqrt().add(1).pow(17)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)).divide(CrFunctions.GAMMA.cr(new Q(7, 10)).pow(17)).divide(CrFunctions.GAMMA.cr(new Q(9, 10)).pow(17)));
  }
}
