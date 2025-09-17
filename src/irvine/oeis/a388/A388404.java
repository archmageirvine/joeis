package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388404 Decimal expansion of (1/68719476736) * exp(4 * Pi) * Pi^24 / Gamma(3/4)^96.
 * @author Sean A. Irvine
 */
public class A388404 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388404() {
    super(0, CR.PI.multiply(4).exp().divide(68719476736L).multiply(CR.PI.pow(24)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(96)));
  }
}
