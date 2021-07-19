package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154215 Decimal expansion of log_23 (12).
 * @author Sean A. Irvine
 */
public class A154215 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154215() {
    super(CR.valueOf(12).log().divide(CR.valueOf(23).log()));
  }
}
