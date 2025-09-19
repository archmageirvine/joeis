package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388615 Decimal expansion of exp(Pi / 8) * Pi^(1/4) * 2^(1/12) / Gamma(3/4) / (sqrt(2) * (1+3^(1/2)))^(1/3).
 * @author Sean A. Irvine
 */
public class A388615 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388615() {
    super(1, CR.PI.divide(8).exp().multiply(CR.PI.pow(Q.ONE_QUARTER)).multiply(CR.TWO.pow(new Q(1, 12))).divide(CrFunctions.GAMMA.cr(new Q(3, 4))).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(Q.ONE_THIRD)));
  }
}
