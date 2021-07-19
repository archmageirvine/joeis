package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154479 Decimal expansion of log_11 (14).
 * @author Sean A. Irvine
 */
public class A154479 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154479() {
    super(CR.valueOf(14).log().divide(CR.valueOf(11).log()));
  }
}
