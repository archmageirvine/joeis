package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388684 Decimal expansion of (2 * (3+sqrt(3))) / 9.
 * @author Sean A. Irvine
 */
public class A388684 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388684() {
    super(1, CrFunctions.GAMMA.cr(new Q(2, 3)).square().divide(6).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).multiply(CR.ONE.add(CR.THREE.sqrt()).square()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(11, 12))));
  }
}
