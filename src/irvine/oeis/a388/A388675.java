package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388675 Decimal expansion of ((1+sqrt(5)) * Pi * exp(Pi / 2)) / (20 * Gamma(3/4)^4).
 * @author Sean A. Irvine
 */
public class A388675 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388675() {
    super(1, CR.HALF_PI.exp().divide(100).multiply(CR.PI).multiply(CR.FIVE.add(CR.FIVE.sqrt())).multiply(CR.FIVE.sqrt()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
