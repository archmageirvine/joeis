package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388942 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388942 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388942() {
    super(1, CR.PI.divide(3).exp().divide(48).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CR.THREE.sqrt()).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.TWO.add(CR.SQRT2).square()).multiply(CR.THREE.sqrt().subtract(1)).divide(CR.SQRT_PI));
  }
}
