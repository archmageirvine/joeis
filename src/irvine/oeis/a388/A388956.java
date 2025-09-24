package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388956 Decimal expansion of Pi^(13/4) / Gamma(3/4)^13.
 * @author Sean A. Irvine
 */
public class A388956 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388956() {
    super(1, CR.PI.pow(new Q(13, 4)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(13)));
  }
}
