package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388565 Decimal expansion of (1/16) * 2^(5/8) * Gamma(5/8)^3 * (2+sqrt(2))^2 / Pi^(3/4) / Gamma(7/8)^3.
 * @author Sean A. Irvine
 */
public class A388565 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388565() {
    super(1, CR.TWO.pow(new Q(5, 8)).divide(16).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CR.TWO.add(CR.SQRT2).square()).divide(CR.PI.pow(new Q(3, 4))));
  }
}
