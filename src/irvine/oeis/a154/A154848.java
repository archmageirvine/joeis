package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154848 Decimal expansion of log_3 (17).
 * @author Sean A. Irvine
 */
public class A154848 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154848() {
    super(CR.valueOf(17).log().divide(CR.THREE.log()));
  }
}
