package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154509 Decimal expansion of log_22 (14).
 * @author Sean A. Irvine
 */
public class A154509 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154509() {
    super(0, CR.valueOf(14).log().divide(CR.valueOf(22).log()));
  }
}
