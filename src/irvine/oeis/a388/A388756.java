package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388756 Decimal expansion of Pi^(3/4) / (sqrt(2) * Gamma(3/4)^3).
 * @author Sean A. Irvine
 */
public class A388756 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388756() {
    super(0, CR.PI.pow(new Q(3, 4)).divide(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
