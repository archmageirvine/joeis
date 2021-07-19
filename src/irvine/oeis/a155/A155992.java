package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155992 Decimal expansion of log_17 (24).
 * @author Sean A. Irvine
 */
public class A155992 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155992() {
    super(CR.valueOf(24).log().divide(CR.valueOf(17).log()));
  }
}
