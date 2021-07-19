package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154468 Decimal expansion of log_8 (14).
 * @author Sean A. Irvine
 */
public class A154468 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154468() {
    super(CR.valueOf(14).log().divide(CR.EIGHT.log()));
  }
}
