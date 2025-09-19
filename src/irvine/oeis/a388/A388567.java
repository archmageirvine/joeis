package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388567 Decimal expansion of (1/2) * Pi^(3/2) / Gamma(3/4)^6.
 * @author Sean A. Irvine
 */
public class A388567 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388567() {
    super(0, CR.PI.pow(new Q(3, 2)).divide(2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)));
  }
}
