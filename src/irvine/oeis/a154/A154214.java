package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154214 Decimal expansion of log_22 (12).
 * @author Sean A. Irvine
 */
public class A154214 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154214() {
    super(0, CR.valueOf(12).log().divide(CR.valueOf(22).log()));
  }
}
