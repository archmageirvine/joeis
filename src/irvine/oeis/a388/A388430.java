package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388430 Decimal expansion of sqrt(-2/5+1 / sqrt(5)) * exp(Pi / 2).
 * @author Sean A. Irvine
 */
public class A388430 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388430() {
    super(1, CR.HALF_PI.exp().divide(25600).multiply(CR.TWO.pow(new Q(2, 5))).multiply(CR.FIVE.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(4, 5)).pow(6)).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).pow(3)).multiply(CR.FIVE.sqrt().subtract(1).pow(3)).multiply(CR.FIVE.sqrt().add(1).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(9, 10)).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(7, 10)).pow(3)));
  }
}
