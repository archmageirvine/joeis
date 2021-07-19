package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155496 Decimal expansion of log_7(20).
 * @author Sean A. Irvine
 */
public class A155496 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155496() {
    super(CR.valueOf(20).log().divide(CR.SEVEN.log()));
  }
}
