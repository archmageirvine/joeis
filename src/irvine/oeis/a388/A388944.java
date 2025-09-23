package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388944 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388944 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388944() {
    super(1, CR.PI.multiply(new Q(11, 12)).exp().divide(-12).multiply(CR.PI.pow(new Q(7, 4))).multiply(CR.TWO.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).multiply(CR.THREE.sqrt().subtract(2)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)));
  }
}
