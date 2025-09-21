package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388783 Decimal expansion of (1/128) * Pi^3 * sqrt(2) / Gamma(3/4)^12.
 * @author Sean A. Irvine
 */
public class A388783 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388783() {
    super(0, CR.PI.pow(3).divide(128).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(12)));
  }
}
