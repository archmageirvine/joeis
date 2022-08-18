package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154901 Decimal expansion of log_21 (17).
 * @author Sean A. Irvine
 */
public class A154901 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154901() {
    super(0, CR.valueOf(17).log().divide(CR.valueOf(21).log()));
  }
}
