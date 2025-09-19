package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388570 Decimal expansion of (1/128) * exp(Pi) * sqrt(2) * Gamma(5/8)^4 * (2+sqrt(2)) / Pi / Gamma(7/8)^4.
 * @author Sean A. Irvine
 */
public class A388570 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388570() {
    super(0, CR.PI.exp().divide(128).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.TWO.add(CR.SQRT2)).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
