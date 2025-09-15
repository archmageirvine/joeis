package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388074 Decimal expansion of Pi^(5/4) / Gamma(3/4)^5.
 * @author Sean A. Irvine
 */
public class A388074 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388074() {
    super(1, CR.PI.pow(new Q(5, 4)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)));
  }
}
