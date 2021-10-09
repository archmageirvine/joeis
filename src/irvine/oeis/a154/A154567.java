package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154567 Decimal expansion of log_6 (15).
 * @author Sean A. Irvine
 */
public class A154567 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154567() {
    super(CR.valueOf(15).log().divide(CR.SIX.log()));
  }
}
