package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388470 Decimal expansion of (1/2) * Pi^(3/4) * 2^(3/8) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388470 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388470() {
    super(0, CR.PI.pow(new Q(3, 4)).multiply(CR.TWO.pow(new Q(-5, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
