package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388686 Decimal expansion of (3/256) * exp(Pi) * Pi^5 / Gamma(3/4)^20.
 * @author Sean A. Irvine
 */
public class A388686 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388686() {
    super(1, CR.PI.exp().multiply(new Q(3, 256)).multiply(CR.PI.pow(5)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(20)));
  }
}
