package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154751 Decimal expansion of log_3(16).
 * @author Sean A. Irvine
 */
public class A154751 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154751() {
    super(CR.valueOf(16).log().divide(CR.THREE.log()));
  }
}
