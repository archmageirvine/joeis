package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155679 Decimal expansion of log_12 (21).
 * @author Sean A. Irvine
 */
public class A155679 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155679() {
    super(CR.valueOf(21).log().divide(CR.valueOf(12).log()));
  }
}
