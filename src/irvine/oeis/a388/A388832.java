package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388832 Decimal expansion of (1/2) * Pi^(5/4) / Gamma(3/4)^5.
 * @author Sean A. Irvine
 */
public class A388832 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388832() {
    super(0, CR.PI.pow(new Q(5, 4)).divide(2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)));
  }
}
