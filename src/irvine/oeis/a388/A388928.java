package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388928 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388928 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388928() {
    super(0, CR.PI.multiply(new Q(2, 3)).exp().divide(-3).multiply(CR.PI).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).multiply(CR.THREE.sqrt().subtract(2)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
