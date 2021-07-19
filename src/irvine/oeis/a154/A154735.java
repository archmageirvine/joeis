package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154735 Decimal expansion of log_24(15).
 * @author Sean A. Irvine
 */
public class A154735 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154735() {
    super(CR.valueOf(15).log().divide(CR.valueOf(24).log()));
  }
}
