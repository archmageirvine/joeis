package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388581 Decimal expansion of 16*2^(7/16) * ((2+sqrt(2)) / Pi)^(9/4) * Gamma(5/4)^3 * sin(Pi / 8)^3.
 * @author Sean A. Irvine
 */
public class A388581 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388581() {
    super(1, CR.TWO.pow(new Q(-73, 16)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CR.TWO.add(CR.SQRT2).pow(new Q(3, 2))).multiply(CR.SQRT2.multiply(CR.TWO.add(CR.SQRT2).sqrt()).pow(new Q(3, 2))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)).divide(CR.PI.pow(new Q(3, 4))));
  }
}
