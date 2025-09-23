package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388955 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388955 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388955() {
    super(0, CR.PI.multiply(new Q(3, 8)).exp().divide(16).multiply(CR.TWO.pow(new Q(1, 8))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).multiply(CR.TWO.subtract(CR.SQRT2).sqrt()).divide(CR.PI));
  }
}
