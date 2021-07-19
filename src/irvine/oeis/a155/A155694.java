package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155694 Decimal expansion of log_3 (22).
 * @author Sean A. Irvine
 */
public class A155694 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155694() {
    super(CR.valueOf(22).log().divide(CR.THREE.log()));
  }
}
