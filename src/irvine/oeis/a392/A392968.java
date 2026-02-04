package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392968 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A392968 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392968() {
    super(1, CR.PI.multiply(CR.ONE.subtract(CR.PHI.pow(4).inverse())).divide(CR.PHI.log().multiply(4)));
  }
}
