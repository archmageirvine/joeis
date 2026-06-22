package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085508 Decimal expansion of conjectured value for the Bloch constant.
 * @author Sean A. Irvine
 */
public class A085508 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A085508() {
    super(0, CR.PI.pow(new Q(3, 2)).multiply(CR.TWO.pow(new Q(3, 4)).divide(CR.THREE.pow(new Q(3, 8)).multiply(CrFunctions.GAMMA.cr(Q.ONE_QUARTER).square()))));
  }
}
