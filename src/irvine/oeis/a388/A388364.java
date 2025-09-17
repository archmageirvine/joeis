package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388364 Decimal expansion of 64 * exp(-17*Pi/24) * 2^(3/8) * Gamma(3/4)^17 / Pi^(17/4).
 * @author Sean A. Irvine
 */
public class A388364 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388364() {
    super(1, CR.PI.multiply(new Q(-17, 24)).exp().multiply(64).multiply(CR.TWO.pow(new Q(3, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(17)).divide(CR.PI.pow(new Q(17, 4))));
  }
}
