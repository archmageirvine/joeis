package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388946 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388946 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388946() {
    super(0, CR.HALF_PI.exp().divide(36).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).multiply(CR.ONE.add(CR.THREE.sqrt()).square()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).square()));
  }
}
