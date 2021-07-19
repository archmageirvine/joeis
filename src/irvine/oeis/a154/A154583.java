package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154583 Decimal expansion of log_13 (15).
 * @author Sean A. Irvine
 */
public class A154583 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154583() {
    super(CR.valueOf(15).log().divide(CR.valueOf(13).log()));
  }
}
