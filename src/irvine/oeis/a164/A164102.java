package irvine.oeis.a164;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A164102 Decimal expansion of 2*Pi^2.
 * @author Sean A. Irvine
 */
public class A164102 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A164102() {
    super(CR.PI.multiply(CR.PI).multiply(CR.TWO));
  }
}
