package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388103 Decimal expansion of (sqrt(676+478 * sqrt(2)) * Gamma(5/8)^13) / (8388608 * Pi^(13/4) * Gamma(7/8)^13).
 * @author Sean A. Irvine
 */
public class A388103 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388103() {
    super(0, CrFunctions.GAMMA.cr(new Q(5, 8)).pow(13).divide(CR.PI.pow(new Q(13, 4))).divide(8388608).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(13)).multiply(CR.SQRT2.multiply(7).add(10)).multiply(CR.TWO.add(CR.SQRT2).sqrt()));
  }
}
