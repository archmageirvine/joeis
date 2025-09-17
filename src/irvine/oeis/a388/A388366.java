package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388366 Decimal expansion of 128 * exp(-19*Pi/24) * 2^(1/8) * Gamma(3/4)^19 / Pi^(19/4).
 * @author Sean A. Irvine
 */
public class A388366 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388366() {
    super(1, CR.PI.multiply(new Q(-19, 24)).exp().multiply(128).multiply(CR.TWO.pow(new Q(1, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(19)).divide(CR.PI.pow(new Q(19, 4))));
  }
}
