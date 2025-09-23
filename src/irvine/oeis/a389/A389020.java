package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389020 Decimal expansion of (1/8) * Pi^3 / Gamma(3/4)^12.
 * @author Sean A. Irvine
 */
public class A389020 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389020() {
    super(0, CR.PI.pow(3).divide(8).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(12)));
  }
}
