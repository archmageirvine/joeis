package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154157 Decimal expansion of log_6 (10).
 * @author Sean A. Irvine
 */
public class A154157 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154157() {
    super(CR.TEN.log().divide(CR.SIX.log()));
  }
}
