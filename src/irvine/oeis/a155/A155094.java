package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155094 Decimal expansion of log_18 (19).
 * @author Sean A. Irvine
 */
public class A155094 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155094() {
    super(CR.valueOf(19).log().divide(CR.valueOf(18).log()));
  }
}
