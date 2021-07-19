package irvine.oeis.a102;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A102753 Decimal expansion of (Pi^2)/2.
 * @author Sean A. Irvine
 */
public class A102753 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A102753() {
    super(CR.PI.multiply(CR.PI).divide(CR.TWO));
  }
}
