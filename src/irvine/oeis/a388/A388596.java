package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388596 Decimal expansion of 1/6 / sqrt(Pi) * 3^(3/4) * Gamma(2/3) * Gamma(3/4) * (1+3^(1/2)) / Gamma(11/12).
 * @author Sean A. Irvine
 */
public class A388596 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388596() {
    super(0, CR.THREE.pow(new Q(3, 4)).divide(CR.SQRT_PI).divide(6).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(11, 12))));
  }
}
