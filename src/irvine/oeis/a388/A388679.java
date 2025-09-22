package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388679 Decimal expansion of exp(Pi/3)*(3 + sqrt(3))/18.
 * @author Sean A. Irvine
 */
public class A388679 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388679() {
    super(0, CR.PI.divide(3).exp().divide(24).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).multiply(CR.ONE.add(CR.THREE.sqrt()).square()).divide(CrFunctions.GAMMA.cr(new Q(11, 12))).divide(CR.PI));
  }
}
