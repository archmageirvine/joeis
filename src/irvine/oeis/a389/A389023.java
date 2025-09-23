package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389023 Decimal expansion of (1/8388608) * exp(9*Pi/2) * Pi^9 * sqrt(2) / Gamma(3/4)^36.
 * @author Sean A. Irvine
 */
public class A389023 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389023() {
    super(1, CR.PI.multiply(new Q(9, 2)).exp().divide(8388608).multiply(CR.PI.pow(9)).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(36)));
  }
}
