package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389027 Decimal expansion of Pi^2 / (sqrt(2) * Gamma(3/4)^8).
 * @author Sean A. Irvine
 */
public class A389027 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389027() {
    super(1, CR.PI.square().divide(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
