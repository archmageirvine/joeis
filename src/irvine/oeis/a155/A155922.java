package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155922 Decimal expansion of log_3 (24).
 * @author Sean A. Irvine
 */
public class A155922 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155922() {
    super(CR.valueOf(24).log().divide(CR.THREE.log()));
  }
}
