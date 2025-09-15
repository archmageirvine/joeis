package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388079 Decimal expansion of Pi^2 / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A388079 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388079() {
    super(1, CR.PI.pow(2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
