package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389057 Decimal expansion of (1/64) / Pi^(3/2) / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A389057 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389057() {
    super(0, CR.PI.pow(new Q(3, 2)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).multiply(64).inverse());
  }
}
