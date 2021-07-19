package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153098 Decimal expansion of log_22 (3).
 * @author Sean A. Irvine
 */
public class A153098 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153098() {
    super(CR.THREE.log().divide(CR.valueOf(22).log()));
  }
}
