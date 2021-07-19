package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154394 Decimal expansion of log_11 (13).
 * @author Sean A. Irvine
 */
public class A154394 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154394() {
    super(CR.valueOf(13).log().divide(CR.valueOf(11).log()));
  }
}
