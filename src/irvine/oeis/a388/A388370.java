package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388370 Decimal expansion of 256 * exp(-23*Pi/24) * 2^(5/8) * Gamma(3/4)^23 / Pi^(23/4).
 * @author Sean A. Irvine
 */
public class A388370 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388370() {
    super(1, CR.PI.multiply(new Q(-23, 24)).exp().multiply(256).multiply(CR.TWO.pow(new Q(5, 8))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(23)).divide(CR.PI.pow(new Q(23, 4))));
  }
}
