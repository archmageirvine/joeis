package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154459 Decimal expansion of log_22 (13).
 * @author Sean A. Irvine
 */
public class A154459 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154459() {
    super(CR.valueOf(13).log().divide(CR.valueOf(22).log()));
  }
}
