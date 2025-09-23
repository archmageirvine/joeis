package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388917 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388917 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388917() {
    super(1, CR.PI.multiply(new Q(11, 12)).exp().divide(48).multiply(CR.PI.pow(new Q(3, 2))).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(4)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(11)));
  }
}
