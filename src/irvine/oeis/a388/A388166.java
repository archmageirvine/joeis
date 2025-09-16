package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388166 Decimal expansion of Pi^(3/4) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388166 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388166() {
    super(1, CR.PI.pow(new Q(3, 4)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
