package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388960 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388960 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388960() {
    super(1, CR.TWO.pow(Q.ONE_QUARTER).multiply(4).divide(3).multiply(CR.THREE.pow(new Q(5, 6))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(8, 3))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(4, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(4, 3))).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CR.PI.pow(new Q(13, 12))).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(Q.ONE_THIRD)));
  }
}
