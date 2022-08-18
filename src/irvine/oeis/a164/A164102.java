package irvine.oeis.a164;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A164102 Decimal expansion of 2*Pi^2.
 * @author Sean A. Irvine
 */
public class A164102 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A164102() {
    super(2, CR.PI.multiply(CR.PI).multiply(CR.TWO));
  }
}
