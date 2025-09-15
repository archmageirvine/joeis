package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388107 Decimal expansion of 1/32 / Pi^(3/4) * 2^(15/16) / Gamma(7/8)^3 * Gamma(5/8)^3 * (2+sqrt(2))^(3/2) / (sqrt(2) * (2+sqrt(2))^(1/2))^(3/2).
 * @author Sean A. Irvine
 */
public class A388107 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388107() {
    super(0, CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3).divide(CR.PI.pow(new Q(3, 4))).divide(32).multiply(CR.TWO.pow(new Q(15, 16))).multiply(CR.TWO.add(CR.SQRT2).pow(new Q(3, 2)).divide(CR.SQRT2.multiply(CR.TWO.add(CR.SQRT2).sqrt()).pow(new Q(3, 2))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3))));
  }
}
