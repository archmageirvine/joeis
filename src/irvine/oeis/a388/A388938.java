package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388938 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388938 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388938() {
    super(0, CR.PI.multiply(new Q(13, 24)).exp().divide(16).multiply(CR.TWO.pow(new Q(1, 8))).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(5)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(6)).divide(CR.SQRT_PI).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(11)));
  }
}
