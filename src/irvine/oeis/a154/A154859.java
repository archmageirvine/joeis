package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154859 Decimal expansion of log_9 (17).
 * @author Sean A. Irvine
 */
public class A154859 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154859() {
    super(CR.valueOf(17).log().divide(CR.NINE.log()));
  }
}
