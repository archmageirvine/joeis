package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154899 Decimal expansion of log_19 (17).
 * @author Sean A. Irvine
 */
public class A154899 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154899() {
    super(CR.valueOf(17).log().divide(CR.valueOf(19).log()));
  }
}
