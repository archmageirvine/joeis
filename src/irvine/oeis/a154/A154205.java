package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154205 Decimal expansion of log_13 (12).
 * @author Sean A. Irvine
 */
public class A154205 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154205() {
    super(CR.valueOf(12).log().divide(CR.valueOf(13).log()));
  }
}
