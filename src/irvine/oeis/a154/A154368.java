package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154368 Decimal expansion of log_10 (13).
 * @author Sean A. Irvine
 */
public class A154368 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154368() {
    super(CR.valueOf(13).log().divide(CR.TEN.log()));
  }
}
