package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388637 Decimal expansion of (sqrt((11+5 * sqrt(5)) / 10) * Pi * exp(Pi)) / (50 * Gamma(3/4)^4).
 * @author Sean A. Irvine
 */
public class A388637 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388637() {
    super(0, CR.PI.exp().divide(320000).multiply(CR.PI).multiply(CR.FIVE.pow(Q.ONE_QUARTER)).multiply(CR.SQRT2).multiply(CR.FIVE.subtract(CR.FIVE.sqrt()).pow(new Q(5, 2))).multiply(CR.FIVE.sqrt().add(1).pow(5)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
