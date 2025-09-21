package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388786 Decimal expansion of (27/1024) * exp(Pi) * Pi^7 / Gamma(3/4)^28.
 * @author Sean A. Irvine
 */
public class A388786 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388786() {
    super(1, CR.PI.exp().multiply(new Q(27, 1024)).multiply(CR.PI.pow(7)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(28)));
  }
}
