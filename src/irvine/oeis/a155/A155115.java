package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155115 Decimal expansion of log_20 (19).
 * @author Sean A. Irvine
 */
public class A155115 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155115() {
    super(CR.valueOf(19).log().divide(CR.valueOf(20).log()));
  }
}
