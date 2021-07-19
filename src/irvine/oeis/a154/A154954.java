package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154954 Decimal expansion of log_11 (18).
 * @author Sean A. Irvine
 */
public class A154954 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154954() {
    super(CR.valueOf(18).log().divide(CR.valueOf(11).log()));
  }
}
