package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154400 Decimal expansion of log_18 (13).
 * @author Sean A. Irvine
 */
public class A154400 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154400() {
    super(CR.valueOf(13).log().divide(CR.valueOf(18).log()));
  }
}
