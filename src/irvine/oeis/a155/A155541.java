package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155541 Decimal expansion of log_3 (21).
 * @author Sean A. Irvine
 */
public class A155541 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155541() {
    super(CR.valueOf(21).log().divide(CR.THREE.log()));
  }
}
