package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388929 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388929 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388929() {
    super(1, CR.PI.pow(new Q(5, 4)).multiply(CR.THREE.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
