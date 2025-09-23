package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388937 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388937 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388937() {
    super(0, CR.PI.multiply(new Q(7, 24)).exp().divide(3).multiply(CR.PI.pow(Q.ONE_QUARTER)).multiply(CR.TWO.pow(new Q(13, 24))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(3, 4))).divide(CrFunctions.GAMMA.cr(new Q(5, 6)).sqrt()));
  }
}
