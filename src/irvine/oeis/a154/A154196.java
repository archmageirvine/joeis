package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154196 Decimal expansion of log_3 (12).
 * @author Sean A. Irvine
 */
public class A154196 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154196() {
    super(CR.valueOf(12).log().divide(CR.THREE.log()));
  }
}
