package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388958 Decimal expansion of Pi^(15/4) / Gamma(3/4)^15.
 * @author Sean A. Irvine
 */
public class A388958 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388958() {
    super(1, CR.PI.pow(new Q(15, 4)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(15)));
  }
}
