package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388795 Decimal expansion of (1/128) * exp(5*Pi/4) * Pi^(5/2) * 2^(3/4) / Gamma(3/4)^10.
 * @author Sean A. Irvine
 */
public class A388795 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388795() {
    super(1, CR.PI.multiply(new Q(5, 4)).exp().divide(128).multiply(CR.PI.pow(new Q(5, 2))).multiply(CR.TWO.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(10)));
  }
}
