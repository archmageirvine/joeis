package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388809 Decimal expansion of (9/2) * Pi / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388809 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388809() {
    super(1, CR.PI.multiply(9).divide(2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
