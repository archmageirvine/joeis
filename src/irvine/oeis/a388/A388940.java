package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388940 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388940 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388940() {
    super(1, CR.PI.pow(new Q(7, 12)).divide(8).multiply(CR.THREE.pow(new Q(1, 6))).multiply(CR.SQRT2).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(7, 12))).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(Q.ONE_THIRD)).multiply(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(4, 3))).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(4, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(2, 3))));
  }
}
