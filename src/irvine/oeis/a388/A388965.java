package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388965 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A388965 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388965() {
    super(1, CR.PI.divide(-4).exp().divide(-4).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(4)).multiply(CR.THREE.add(CR.SQRT2.multiply(2))).divide(CR.SQRT2.subtract(2)).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(4)));
  }
}
