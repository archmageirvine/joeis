package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388176 Decimal expansion of 512 * exp(-Pi) * Gamma(3/4)^24 / Pi^6.
 * @author Sean A. Irvine
 */
public class A388176 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388176() {
    super(1, CR.PI.negate().exp().multiply(512).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(24)).divide(CR.PI.pow(6)));
  }
}
