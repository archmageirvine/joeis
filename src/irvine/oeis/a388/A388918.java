package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388918 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388918 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388918() {
    super(1, CR.PI.divide(8).exp().divide(32).multiply(CR.TWO.pow(new Q(5, 8))).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(5)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(new Q(3, 2))).multiply(CR.THREE.pow(new Q(1, 8))).multiply(CR.THREE.sqrt().multiply(5).add(9)).divide(CR.PI.square()).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(7, 2))));
  }
}
