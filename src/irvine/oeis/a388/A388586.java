package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388586 Decimal expansion of (1024 * sqrt(239+169 * sqrt(2)) * exp(Pi / 2) * Gamma(5/4)^6 * sin(Pi / 8)^6) / Pi^(9/2).
 * @author Sean A. Irvine
 */
public class A388586 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388586() {
    super(1, CR.HALF_PI.exp().divide(256).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(6)).multiply(CR.TWO.pow(new Q(3, 4))).multiply(CR.SQRT2.multiply(7).add(10)).multiply(CR.TWO.add(CR.SQRT2).sqrt()).divide(CR.PI.pow(new Q(3, 2))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(6)));
  }
}
