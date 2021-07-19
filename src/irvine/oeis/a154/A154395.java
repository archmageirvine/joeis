package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154395 Decimal expansion of log_12 (13).
 * @author Sean A. Irvine
 */
public class A154395 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154395() {
    super(CR.valueOf(13).log().divide(CR.valueOf(12).log()));
  }
}
