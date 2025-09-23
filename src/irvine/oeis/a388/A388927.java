package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388927 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388927 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388927() {
    super(1, CR.PI.pow(new Q(2, 3)).multiply(CR.THREE.pow(Q.ONE_THIRD)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(26, 3))).multiply(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(11, 3))).multiply(CR.SQRT2).divide(CR.THREE.sqrt().multiply(66).add(114)).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(5)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(4, 3))).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(11, 3))));
  }
}
