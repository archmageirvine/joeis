package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154480 Decimal expansion of log_12 (14).
 * @author Sean A. Irvine
 */
public class A154480 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154480() {
    super(CR.valueOf(14).log().divide(CR.valueOf(12).log()));
  }
}
