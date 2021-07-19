package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154776 Decimal expansion of log_6 (16).
 * @author Sean A. Irvine
 */
public class A154776 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154776() {
    super(CR.valueOf(16).log().divide(CR.SIX.log()));
  }
}
