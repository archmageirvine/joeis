package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388824 Decimal expansion of (81 * (2+sqrt(5)) * Pi) / (1280 * Gamma(7/4)^4).
 * @author Sean A. Irvine
 */
public class A388824 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388824() {
    super(1, CR.TWO.pow(new Q(1, 5)).divide(12800).multiply(CR.FIVE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(3, 5)).pow(4)).multiply(CrFunctions.GAMMA.cr(new Q(7, 10)).square()).multiply(CR.FIVE.add(CR.FIVE.sqrt()).square()).multiply(CR.FIVE.sqrt().add(1).pow(4)).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)).divide(CrFunctions.GAMMA.cr(new Q(9, 10)).square()));
  }
}
