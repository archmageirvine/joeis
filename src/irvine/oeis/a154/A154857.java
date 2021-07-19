package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154857 Decimal expansion of log_7(17).
 * @author Sean A. Irvine
 */
public class A154857 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154857() {
    super(CR.valueOf(17).log().divide(CR.SEVEN.log()));
  }
}
