package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388104 Decimal expansion of (1/128) * Pi^4 / Gamma(3/4)^16.
 * @author Sean A. Irvine
 */
public class A388104 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388104() {
    super(0, CR.PI.pow(4).divide(128).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(16)));
  }
}
