package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388757 Decimal expansion of (Pi^(3/4) * exp(Pi / 8)) / (2^(5/8) * Gamma(3/4)^3).
 * @author Sean A. Irvine
 */
public class A388757 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388757() {
    super(1, CR.PI.divide(8).exp().multiply(CR.PI.pow(new Q(3, 4))).multiply(CR.TWO.pow(new Q(-5, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
