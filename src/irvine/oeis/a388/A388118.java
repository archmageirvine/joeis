package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388118 Decimal expansion of (16 * sqrt(2+sqrt(2)) * exp(Pi) * Gamma(5/4)^3 * sin(Pi / 8)^3) / Pi^(9/4).
 * @author Sean A. Irvine
 */
public class A388118 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388118() {
    super(1, CR.PI.exp().divide(32).divide(CR.PI.pow(new Q(3, 4))).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CR.TWO.add(CR.SQRT2).sqrt()));
  }
}
