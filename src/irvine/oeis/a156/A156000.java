package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A156000 Decimal expansion of log_19 (24).
 * @author Sean A. Irvine
 */
public class A156000 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A156000() {
    super(CR.valueOf(24).log().divide(CR.valueOf(19).log()));
  }
}
