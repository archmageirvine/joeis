package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388191 Decimal expansion of (1/16) * exp(3/4 * Pi) * Pi^(3/2) * 2^(1/4) / Gamma(3/4)^6.
 * @author Sean A. Irvine
 */
public class A388191 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388191() {
    super(1, CR.PI.multiply(new Q(3, 4)).exp().divide(16).multiply(CR.PI.pow(new Q(3, 2))).multiply(CR.TWO.pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)));
  }
}
