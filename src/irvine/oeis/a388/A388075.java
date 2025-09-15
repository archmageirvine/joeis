package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388075 Decimal expansion of Pi^(3/2) / Gamma(3/4)^6.
 * @author Sean A. Irvine
 */
public class A388075 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388075() {
    super(1, CR.PI.pow(new Q(3, 2)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)));
  }
}
