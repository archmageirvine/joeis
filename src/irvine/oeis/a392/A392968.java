package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392968 Decimal expansion of the area swept by 1 complete rotation about its origin of the radius of the golden spiral to maximum radius 1.
 * @author Sean A. Irvine
 */
public class A392968 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392968() {
    super(1, CR.PI.multiply(CR.ONE.subtract(CR.PHI.pow(4).inverse())).divide(CR.PHI.log().multiply(4)));
  }
}
