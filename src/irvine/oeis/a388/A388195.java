package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388195 Decimal expansion of Pi^(9/4) / Gamma(3/4)^9.
 * @author Sean A. Irvine
 */
public class A388195 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388195() {
    super(1, CR.PI.pow(new Q(9, 4)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(9)));
  }
}
