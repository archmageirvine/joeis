package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388963 Decimal expansion of ((9512+6726 * sqrt(2))^(1/4) * exp(-Pi/8) * Gamma(1/4)^4 * sin(Pi / 8)^4) / Pi^3.
 * @author Sean A. Irvine
 */
public class A388963 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388963() {
    super(0, CR.TWO.pow(new Q(-23, 8)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.TWO.add(CR.SQRT2).sqrt()).multiply(CR.PI.divide(-8).exp()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
