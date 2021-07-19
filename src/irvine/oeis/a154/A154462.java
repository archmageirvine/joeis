package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154462 Decimal expansion of log_2 (14).
 * @author Sean A. Irvine
 */
public class A154462 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154462() {
    super(CR.valueOf(14).log().divide(CR.TWO.log()));
  }
}
