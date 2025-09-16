package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388194 Decimal expansion of Pi^(7/4) / Gamma(3/4)^7.
 * @author Sean A. Irvine
 */
public class A388194 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388194() {
    super(1, CR.PI.pow(new Q(7, 4)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(7)));
  }
}
