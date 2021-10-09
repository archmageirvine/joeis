package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154584 Decimal expansion of log_14 (15).
 * @author Sean A. Irvine
 */
public class A154584 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154584() {
    super(CR.valueOf(15).log().divide(CR.valueOf(14).log()));
  }
}
