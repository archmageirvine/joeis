package irvine.oeis.a114;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A114490 Decimal expansion of log_10(3).
 * @author Sean A. Irvine
 */
public class A114490 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A114490() {
    super(0, CR.THREE.log().divide(CR.LOG10));
  }
}
