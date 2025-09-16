package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388225 Decimal expansion of (1/1024) * exp(25*Pi/24) * Pi^(25/4) * 2^(5/8) / Gamma(3/4)^25.
 * @author Sean A. Irvine
 */
public class A388225 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388225() {
    super(0, CR.PI.multiply(new Q(25, 24)).exp().divide(1024).multiply(CR.PI.pow(new Q(25, 4))).multiply(CR.TWO.pow(new Q(5, 8))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(25)));
  }
}
