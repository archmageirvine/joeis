package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154161 Decimal expansion of log_11 (10).
 * @author Sean A. Irvine
 */
public class A154161 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154161() {
    super(0, CR.LOG10.divide(CR.valueOf(11).log()));
  }
}
