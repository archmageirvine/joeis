package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388473 Decimal expansion of (1/2) * Pi^(1/4) * 2^(7/8) / Gamma(3/4).
 * @author Sean A. Irvine
 */
public class A388473 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388473() {
    super(0, CR.PI.pow(Q.ONE_QUARTER).divide(2).multiply(CR.TWO.pow(new Q(7, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
