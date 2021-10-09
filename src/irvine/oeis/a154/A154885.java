package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154885 Decimal expansion of log_13 (17).
 * @author Sean A. Irvine
 */
public class A154885 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154885() {
    super(CR.valueOf(17).log().divide(CR.valueOf(13).log()));
  }
}
