package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154463 Decimal expansion of log_3 (14).
 * @author Sean A. Irvine
 */
public class A154463 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154463() {
    super(CR.valueOf(14).log().divide(CR.THREE.log()));
  }
}
