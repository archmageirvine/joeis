package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154464 Decimal expansion of log_4 (14).
 * @author Sean A. Irvine
 */
public class A154464 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154464() {
    super(CR.valueOf(14).log().divide(CR.FOUR.log()));
  }
}
