package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153027 Decimal expansion of log_19 (3).
 * @author Sean A. Irvine
 */
public class A153027 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153027() {
    super(CR.THREE.log().divide(CR.valueOf(19).log()));
  }
}
