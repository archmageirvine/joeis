package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020857 Decimal expansion of log_2(3).
 * @author Sean A. Irvine
 */
public class A020857 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020857() {
    super(CR.THREE.log().divide(CR.TWO.log()));
  }
}
