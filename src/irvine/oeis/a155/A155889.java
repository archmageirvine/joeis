package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155889 Decimal expansion of log_18 (23).
 * @author Sean A. Irvine
 */
public class A155889 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155889() {
    super(CR.valueOf(23).log().divide(CR.valueOf(18).log()));
  }
}
