package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388606 Decimal expansion of -1/9 * ((-3+sqrt(3)) * exp((2 * Pi) / 3)).
 * @author Sean A. Irvine
 */
public class A388606 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388606() {
    super(1, CR.PI.multiply(new Q(2, 3)).exp().multiply(new Q(2, 9)).multiply(CR.PI).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.THREE.sqrt().subtract(1).square()).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).divide(CrFunctions.GAMMA.cr(new Q(7, 12))));
  }
}
