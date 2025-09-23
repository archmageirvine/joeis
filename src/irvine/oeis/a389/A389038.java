package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389038 Decimal expansion of (1/128) * Pi^7 / Gamma(3/4)^28.
 * @author Sean A. Irvine
 */
public class A389038 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389038() {
    super(0, CR.PI.pow(7).divide(128).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(28)));
  }
}
