package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389032 Decimal expansion of 3 * exp(Pi / 2) * Pi^2 * sqrt(2) / Gamma(3/4)^8.
 * @author Sean A. Irvine
 */
public class A389032 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389032() {
    super(2, CR.HALF_PI.exp().multiply(3).multiply(CR.PI.square()).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)));
  }
}
