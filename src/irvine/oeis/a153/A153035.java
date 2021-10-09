package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A153035 Decimal expansion of log_20 (3).
 * @author Sean A. Irvine
 */
public class A153035 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A153035() {
    super(CR.THREE.log().divide(CR.valueOf(20).log()));
  }
}
