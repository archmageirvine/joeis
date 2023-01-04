package irvine.oeis.a358;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A358981 allocated for Michal Paulovic.
 * @author Sean A. Irvine
 */
public class A358981 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A358981() {
    super(0, CR.PI.divide(CR.THREE).subtract(CR.THREE.sqrt().divide(CR.FOUR)));
  }
}
