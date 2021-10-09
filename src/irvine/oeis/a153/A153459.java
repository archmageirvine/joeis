package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153459 Decimal expansion of log_3 (6).
 * @author Sean A. Irvine
 */
public class A153459 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153459() {
    super(CR.SIX.log().divide(CR.THREE.log()));
  }
}
