package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154802 Decimal expansion of log_12 (16).
 * @author Sean A. Irvine
 */
public class A154802 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154802() {
    super(CR.valueOf(16).log().divide(CR.valueOf(12).log()));
  }
}
