package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155830 Decimal expansion of log_10 (23).
 * @author Sean A. Irvine
 */
public class A155830 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155830() {
    super(CR.valueOf(23).log().divide(CR.TEN.log()));
  }
}
