package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154542 Decimal expansion of log_3 (15).
 * @author Sean A. Irvine
 */
public class A154542 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154542() {
    super(CR.valueOf(15).log().divide(CR.THREE.log()));
  }
}
