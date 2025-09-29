package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388598 Decimal expansion of ((4+3 * sqrt(2))^(1/8) * exp(Pi / 4) * Gamma(1/4) * sin(Pi / 8)) / (2^(5/8) * Pi^(3/4)).
 * @author Sean A. Irvine
 */
public class A388598 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388598() {
    super(1, CR.PI.divide(4).exp().multiply(CR.TWO.pow(new Q(-11, 16))).multiply(CrFunctions.GAMMA.cr(new Q(5, 8))).divide(CR.PI.pow(Q.ONE_QUARTER)).divide(CR.SQRT2.multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).sqrt()).divide(CR.SQRT2.multiply(CR.TWO.add(CR.SQRT2).sqrt()).sqrt()).multiply(CR.TWO.add(CR.SQRT2).pow(Q.ONE_QUARTER)).divide(CrFunctions.GAMMA.cr(new Q(7, 8))));
  }
}
