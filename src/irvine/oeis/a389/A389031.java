package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389031 Decimal expansion of Pi^8 / Gamma(3/4)^32.
 * @author Sean A. Irvine
 */
public class A389031 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389031() {
    super(2, CR.PI.pow(8).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(32)));
  }
}
