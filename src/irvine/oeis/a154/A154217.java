package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154217 Decimal expansion of log_3 (13).
 * @author Sean A. Irvine
 */
public class A154217 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154217() {
    super(CR.valueOf(13).log().divide(CR.THREE.log()));
  }
}
