package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154978 Decimal expansion of log_22 (18).
 * @author Sean A. Irvine
 */
public class A154978 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154978() {
    super(CR.valueOf(18).log().divide(CR.valueOf(22).log()));
  }
}
