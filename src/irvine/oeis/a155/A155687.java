package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155687 Decimal expansion of log_20 (21).
 * @author Sean A. Irvine
 */
public class A155687 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155687() {
    super(CR.valueOf(21).log().divide(CR.valueOf(20).log()));
  }
}
