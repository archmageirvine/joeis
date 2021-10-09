package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155080 Decimal expansion of log_17 (19).
 * @author Sean A. Irvine
 */
public class A155080 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155080() {
    super(CR.valueOf(19).log().divide(CR.valueOf(17).log()));
  }
}
