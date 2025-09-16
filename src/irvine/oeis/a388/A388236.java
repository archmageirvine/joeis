package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388236 Decimal expansion of (1/16777216) * exp(8*Pi/3) * Pi^16 / Gamma(3/4)^64.
 * @author Sean A. Irvine
 */
public class A388236 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388236() {
    super(0, CR.PI.multiply(new Q(8, 3)).exp().divide(16777216).multiply(CR.PI.pow(16)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(64)));
  }
}
