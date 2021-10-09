package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155684 Decimal expansion of log_17 (21).
 * @author Sean A. Irvine
 */
public class A155684 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155684() {
    super(CR.valueOf(21).log().divide(CR.valueOf(17).log()));
  }
}
