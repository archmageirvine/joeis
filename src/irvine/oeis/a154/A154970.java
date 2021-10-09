package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154970 Decimal expansion of log_13 (18).
 * @author Sean A. Irvine
 */
public class A154970 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154970() {
    super(CR.valueOf(18).log().divide(CR.valueOf(13).log()));
  }
}
