package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388106 Decimal expansion of 1/64 * Pi^(7/2) / Gamma(3/4)^14.
 * @author Sean A. Irvine
 */
public class A388106 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388106() {
    super(0, CR.PI.pow(new Q(7, 2)).divide(64).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(14)));
  }
}
