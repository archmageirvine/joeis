package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388943 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388943 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388943() {
    super(1, CR.PI.pow(new Q(4, 3)).multiply(CR.THREE.pow(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(14, 3))).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(2, 3))));
  }
}
