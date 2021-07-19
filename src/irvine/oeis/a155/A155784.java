package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155784 Decimal expansion of log_18 (22).
 * @author Sean A. Irvine
 */
public class A155784 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155784() {
    super(CR.valueOf(22).log().divide(CR.valueOf(18).log()));
  }
}
