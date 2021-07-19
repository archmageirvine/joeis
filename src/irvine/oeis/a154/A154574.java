package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154574 Decimal expansion of log_8 (15).
 * @author Sean A. Irvine
 */
public class A154574 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154574() {
    super(CR.valueOf(15).log().divide(CR.EIGHT.log()));
  }
}
