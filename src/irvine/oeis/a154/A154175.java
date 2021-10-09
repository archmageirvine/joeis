package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154175 Decimal expansion of log_3 (11).
 * @author Sean A. Irvine
 */
public class A154175 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154175() {
    super(CR.valueOf(11).log().divide(CR.THREE.log()));
  }
}
