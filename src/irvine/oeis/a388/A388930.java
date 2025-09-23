package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388930 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388930 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388930() {
    super(1, CR.PI.multiply(new Q(2, 3)).exp().divide(18).multiply(CR.THREE.sqrt()).multiply(CR.PI.pow(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
