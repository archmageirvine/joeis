package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388484 Decimal expansion of (3/64) * exp(Pi) * Pi^3 / Gamma(3/4)^12.
 * @author Sean A. Irvine
 */
public class A388484 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388484() {
    super(1, CR.PI.exp().multiply(new Q(3, 64)).multiply(CR.PI.pow(3)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(12)));
  }
}
