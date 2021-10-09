package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155808 Decimal expansion of log_3 (23).
 * @author Sean A. Irvine
 */
public class A155808 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155808() {
    super(CR.valueOf(23).log().divide(CR.THREE.log()));
  }
}
