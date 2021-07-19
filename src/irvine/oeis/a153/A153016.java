package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153016 Decimal expansion of log_13 (3).
 * @author Sean A. Irvine
 */
public class A153016 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153016() {
    super(CR.THREE.log().divide(CR.valueOf(13).log()));
  }
}
