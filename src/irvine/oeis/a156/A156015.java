package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A156015 Decimal expansion of log_20 (24).
 * @author Sean A. Irvine
 */
public class A156015 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A156015() {
    super(CR.valueOf(24).log().divide(CR.valueOf(20).log()));
  }
}
