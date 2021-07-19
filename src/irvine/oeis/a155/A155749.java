package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155749 Decimal expansion of log_12 (22).
 * @author Sean A. Irvine
 */
public class A155749 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155749() {
    super(CR.valueOf(22).log().divide(CR.valueOf(12).log()));
  }
}
