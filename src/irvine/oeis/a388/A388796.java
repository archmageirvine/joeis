package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388796 Decimal expansion of (1/128) * exp(11*Pi/8) * Pi^(11/4) * 2^(1/8) / Gamma(3/4)^11.
 * @author Sean A. Irvine
 */
public class A388796 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388796() {
    super(1, CR.PI.multiply(new Q(11, 8)).exp().divide(128).multiply(CR.PI.pow(new Q(11, 4))).multiply(CR.TWO.pow(new Q(1, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(11)));
  }
}
